package org.edu.exceptions;

import java.sql.SQLException;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class Test {

    // No throws clause here
    public static void main(String[] args) {
        doThrow(new SQLException());
    }

    static void doThrow(Exception e) {
        Test.<RuntimeException>doThrow0( e );
    }

    @SuppressWarnings("unchecked")
    static <E extends Exception> void doThrow0(Exception e) throws E {
        throw ( E ) e;
    }
}