package org.edu.other;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class NumericTypePromotionInConditionalOperator {

    public static void main(String[] args) {
        Integer i = new Integer(1);
        if (i.equals(1)) {
            i = null;
        }
        Double d = new Double(2.0);
        Object o = true ? i : d;
        System.out.println( o );
    }

}
