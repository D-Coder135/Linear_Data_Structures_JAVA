/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 09/06/21
 *   Time: 5:37 PM
 *   File: PostfixEvaluator.java
 */

package stack.applications;

/**
 * Class that evaluates a postfix expression.
 */
public class PostfixEvaluator {

    // Nested class
    /**
     * Class to report a syntax error.
     */
    public static class SyntaxErrorException extends Exception {
        /**
         * Construct a SyntaxErrorException with the specified message.
         *
         * @param message The message
         **/
        SyntaxErrorException(String message) {
            super(message);
        }
    }

    // Constant
    /**
     * A list of operators.
     */
    private static final String OPERATORS = "+-*/";

    // Methods

    private static int evalOp() {

    }
}
