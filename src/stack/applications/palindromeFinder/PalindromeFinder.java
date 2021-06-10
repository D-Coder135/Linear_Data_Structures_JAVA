/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 10/06/21
 *   Time: 10:47 PM
 *   File: PalindromeFinder.java
 */

package stack.applications.palindromeFinder;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Class with methods to check whether a string is a palindrome.
 */
public class PalindromeFinder {

    /**
     * Fills a stack of characters from an input string.
     *
     * @param inputString the string to be checked.
     * @return a stack of characters in inputString.
     */
    private static Deque<Character> fillStack(String inputString) {
        Deque<Character> charStack = new ArrayDeque<>();
        for (int index = 0; index < inputString.length(); index++) {
            charStack.push(inputString.charAt(index));
        }
        return charStack;
    }

    /**
     * Builds the reverse of a string by calling the fillStack to push its characters onto a stack and then popping
     * them and appending then to a new string.
     * @post The stack is empty.
     * @return The string containing the characters in the stack.
     * */
}
