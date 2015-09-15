package org.edu.other;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {

        if(X.isEmpty() || Y.isEmpty()) return 0;

        int initialX = X.get(0);
        int initialY = Y.get(0);

        int result = 0;
        for (int i = 1; i < X.size(); i++) {
            Integer x = X.get(i);
            for (int j = 1; j < Y.size(); j++) {
                Integer y = Y.get(j);

                final int xdist = Math.abs(x - initialX);
                final int ydist = Math.abs(y - initialY);

                result += Math.max(xdist, ydist);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final int i = new Solution().coverPoints(new ArrayList<>(Arrays.asList(4, 8, -7, -5, -13, 9, -7, 8)), new ArrayList<>(Arrays.asList(4, -15, -10, -3, -13, 12, 8, -8)));
        System.out.println(i);
    }
}
