/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 09/06/21
 *   Time: 5:37 PM
 *   File: PostfixEvaluator.java
 */

package stack.applications;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/**
 * Class that evaluates a postfix expression.
 */
public class PostfixEvaluator {

    // Constant
    /**
     * A list of operators.
     */
    private static final String OPERATORS = "+-*/";

    // Methods

    private static int evalOperation(char op, Deque<Integer> operandStack) {
        // Pop the two operands off the stack.
        int rhs = operandStack.pop();
        int lhs = operandStack.pop();

        // Evaluate the operator.
        return switch (op) {
            case '+' -> lhs + rhs;
            case '-' -> lhs - rhs;
            case '/' -> lhs / rhs;
            case '*' -> lhs * rhs;
            default -> 0;
        };
    }

    private static boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }

    public static int eval(String expression) throws SyntaxErrorException {
        // Create an empty stack.
        Deque<Integer> operandStack = new ArrayDeque<>();

        // Process each token.
        String[] tokens = expression.split("\\s+");
        try {
            for (String nextToken : tokens) {
                char firstCharacter = nextToken.charAt(0);

                // Does it start with a digit?
            }
        } catch (NoSuchElementException exception) {
            throw new SyntaxErrorException("Syntax Error: Stack is empty!");
        }
    }

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
}
