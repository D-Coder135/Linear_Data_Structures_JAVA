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

    /**
     * Determines whether a character is an operator.
     *
     * @param ch The character to be tested.
     * @return true if the character is an operator
     */
    private static boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch) != -1;
    }

    /**
     * Evaluates a postfix expression.
     *
     * @param expression The expression to evaluated
     * @return The value of the expression
     * @throws SyntaxErrorException if a syntax error is detected.
     */
    public static int eval(String expression) throws SyntaxErrorException {
        // Create an empty stack.
        Deque<Integer> operandStack = new ArrayDeque<>();

        // Process each token.
        String[] tokens = expression.split("\\s+");
        try {
            for (String nextToken : tokens) {
                char firstCharacter = nextToken.charAt(0);

                // Does it start with a digit?
                if (Character.isDigit(firstCharacter)) {
                    // Get the integer value.
                    int value = Integer.parseInt(nextToken);
                    // Push value onto operand stack.
                    operandStack.push(value);
                } // Is it an operator?
                else if (isOperator(firstCharacter)) {
                    // Evaluate the operator.
                    int result = evalOperation(firstCharacter, operandStack);
                    // Push the result onto the operand stack.
                    operandStack.push(result);
                } else {
                    // Invalid Character.
                    throw new SyntaxErrorException("Invalid character encountered: " + firstCharacter);
                }
            }

            // No more tokens - pop result from the operand stack.
            int answer = operandStack.pop();

            // Operand stack should be empty.
            if (operandStack.isEmpty()) {
                return answer;
            } else {
                // Indicate Syntax Error.
                throw new SyntaxErrorException("Syntax Error: Stack should be empty!");
            }
        } catch (NoSuchElementException exception) {
            // Pop was attempted on an empty stack.
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
