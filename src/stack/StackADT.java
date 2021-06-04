/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 04/06/21
 *   Time: 8:12 PM
 *   File: StackADT.java
 */

package stack;

import java.util.NoSuchElementException;

/**
 * A Stack is a data structure in which objects are inserted into and remove fromt
 * the same end (i.e., Last-In, First-Out).
 *
 * @param <E> The element type
 */

public interface StackADT<E> {

    /**
     * Pushes an item onto the top of the stack and returns the item pushed.
     *
     * @param obj The item to be inserted
     * @return The object inserted
     */
    E push(E obj);

    /**
     * Returns the object at the top of the stack without removing it.
     *
     * @return The object at the top of the stack
     * @throws NoSuchElementException is the stack is empty
     * @post The stack remains unchanged.
     */
    E peek();

    /**
     * Returns the object at the top of the stack and removes it.
     *
     * @return The object at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     * @post The stack is one item smaller.
     */
    E pop();

    /**
     * Returns true if the stack is empty; otherwise returns false.
     *
     * @return true (false) if the stack is empty (not empty)
     */
    boolean isEmpty();
}
