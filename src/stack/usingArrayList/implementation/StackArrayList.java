/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 05/06/21
 *   Time: 6:27 PM
 *   File: StackArrayList.java
 */

package stack.usingArrayList.implementation;

import stack.StackADT;

import java.util.List;

/**
 * Class StackArrayList<E> implements the StackADT<E> as an adapter to the list.
 *
 * @param <E> The type of elements in the stack.
 */
public class StackArrayList<E> implements StackADT {

    /**
     * The list containing the data
     */
    private List<E> theData;

    /**
     * Construct an empty stack using an ArrayList as the container.
     */

    @Override
    public Object push(Object obj) {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
