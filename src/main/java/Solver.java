import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class Solver {

    private ArrayList<Board> solution = new ArrayList<>();
    private boolean isSolvable;
    private int moves;

    private class BoardComparable implements Comparable<BoardComparable> {

        Board board;
        int move;

        public BoardComparable(Board board, int move) {
            this.board = board;
            this.move = move;
        }

        public Board getBoard() {
            return board;
        }

        public int getMove() {
            return move;
        }

        @Override
        public int compareTo(BoardComparable that) {
            return (this.board.manhattan() + this.move) - (that.getBoard().manhattan() + that.getMove());
        }
    }

    // find a solution to the initial board (using the A* algorithm)
    public Solver(Board initial){

        if(initial == null) throw new NullPointerException();

        int moves = 0;
        final MinPQ<BoardComparable> boards = new MinPQ<>();

        boards.insert(new BoardComparable(initial, moves));
        BoardComparable min = boards.delMin();

        while (!min.getBoard().isGoal()) {
            moves++;
            if (!solution.contains(min)) {
                solution.add(min.getBoard());
            }else{
                isSolvable = false;
                this.moves = -1;
                return;
            }
            final Iterable<Board> neighbors = initial.neighbors();

            int ncounts = 0;
            for (Board neighbor : neighbors) {
                if(!exists(boards, neighbor)){
                    boards.insert(new BoardComparable(neighbor,moves));
                    ncounts++;
                }
            }
            if(ncounts == 0){
                isSolvable = false;
                this.moves = -1;
                return;
            }

            min = boards.delMin();
            initial = min.board;
        }
        solution.add(min.getBoard());
        isSolvable = true;
        this.moves = moves;
    }

    private boolean exists(MinPQ<BoardComparable> boards, Board neighbor) {
        final Iterator<BoardComparable> iterator = boards.iterator();
        while (iterator.hasNext()) {
            BoardComparable next = iterator.next();
            if(next.getBoard().equals(neighbor)){
                return true;
            }
        }
        return false;
    }

    // is the initial board solvable?
    public boolean isSolvable(){
        return isSolvable;
    }


    // min number of moves to solve initial board; -1 if unsolvable
    public int moves(){
        return moves;
    }

    // sequence of boards in a shortest solution; null if unsolvable
    public Iterable<Board> solution(){
        return isSolvable ? solution : null;
    }

    // solve a slider puzzle (given below)
    public static void main(String[] args){

        // create initial board from file
        In in = new In(args[0]);
        int N = in.readInt();
        int[][] blocks = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                blocks[i][j] = in.readInt();
        Board initial = new Board(blocks);

        // solve the puzzle
        Solver solver = new Solver(initial);

        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }

    }
}
