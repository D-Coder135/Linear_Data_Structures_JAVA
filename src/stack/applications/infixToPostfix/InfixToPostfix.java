/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 12/06/21
 *   Time: 10:21 PM
 *   File: InfixToPostfix.java
 */

package stack.applications.infixToPostfix;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

/**
 * Translates an infix expression to a postfix expression.
 */
public class InfixToPostfix {

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

    // Data Fields
    /**
     * The operator stack.
     */
    private final Deque<Character> OPERATOR_STACK = new ArrayDeque<>();

    /**
     * The operators
     */
    private static final String OPERATORS = "+-&/";

    /**
     * The precedence of the operators matches order in OPERATORS.
     */
    private static final int[] PRECEDENCE = {1, 1, 2, 2};

    /**
     * The postfix string.
     */
    private final StringJoiner POSTFIX = new StringJoiner(" ");

    /**
     * Convert a string from infix to  postfix. Public covert is called by a client - Calls private method
     * convertToPostfix to do the conversion.
     *
     * @param infix The infix expression
     * @return the equivalent postfix expression.
     * @throws SyntaxErrorException if argument is invalid
     */
    public static String convert(String infix) throws SyntaxErrorException {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        infixToPostfix.convertToPostfix(infix);
        return infixToPostfix.getPostfix();
    }

    /**
     * Return the final postfix string.
     */
    private String getPostfix() {
        return POSTFIX.toString();
    }

    /**
     * Convert a string from infix to postfix. Public convert is called by a client - Calls private method
     * convertToPostfix to do the conversion.
     * Uses a stack to convert an infix expression to postfix.
     *
     * @param infix the string to be converted
     * @throws SyntaxErrorException if argument is invalid
     * @pre operator stack is empty
     * @post postFix contains postfix expression and stack is empty
     */
    private void convertToPostfix(String infix) throws SyntaxErrorException {
        String[] tokens = infix.split("\\s+");
        try {
            // Process each token in the infix string.
            for (String nextToken : tokens) {
                char firstChar = nextToken.charAt(0);

                // Is it an operand?
                if (Character.isJavaIdentifierStart(firstChar) || Character.isDigit(firstChar)) {
                    POSTFIX.add(nextToken);
                } // Is it an operator?
                else if (isOperator(firstChar)) {
                    processOperator(firstChar);
                } else {
                    throw new SyntaxErrorException("Unexpected Error Encountered: " + firstChar);
                }
            }

            // Pop any remaining operators and append them to postfix.
            while (!OPERATOR_STACK.isEmpty()) {
                char op = OPERATOR_STACK.pop();
                POSTFIX.add(Character.toString(op));
            }
        } catch (NoSuchElementException exception) {
            throw new SyntaxErrorException("Syntax Error: The Stack is empty!");
        }
    }

    /**
     * Method to process operators.
     *
     * @param op The operator
     * @throws NoSuchElementException
     */
    private void processOperator(char op) throws NoSuchElementException {
        if (OPERATOR_STACK.isEmpty()) {
            OPERATOR_STACK.push(op);
        } else {
            // Peek the operator stack and let topOp be top operator.
            char topOp = OPERATOR_STACK.peek();
            if (precedence(op) > precedence(topOp)) {
                OPERATOR_STACK.push(op);
            } else {
                // Pop all stacked operators with equal or high precedence than op.
                while (!OPERATOR_STACK.isEmpty() && precedence(op) <= precedence(topOp)) {
                    OPERATOR_STACK.pop();
                    POSTFIX.add(Character.toString(topOp));
                    if (!OPERATOR_STACK.isEmpty()) {
                        // Reset topOp
                        topOp = OPERATOR_STACK.peek();
                    }
                }
                OPERATOR_STACK.push(op);
            }
        }
    }
}
