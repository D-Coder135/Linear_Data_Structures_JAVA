/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 09/06/21
 *   Time: 5:37 PM
 *   File: PostfixEvaluator.java
 */

package stack.applications;

import java.util.Deque;

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

    private static int evalOp(char op, Deque<Integer> operandStack) {
        // Pop the two operands off the stack.
        int rhs = operandStack.pop();
        int lhs = operandStack.pop();
        int result = 0;

        // Evaluate the operator.
        switch (op) {
            case '+':
                result = lhs + rhs;
                break;

        }
    }
}
