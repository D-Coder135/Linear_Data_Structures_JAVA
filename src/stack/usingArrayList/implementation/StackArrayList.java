/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 05/06/21
 *   Time: 6:27 PM
 *   File: StackArrayList.java
 */

package stack.usingArrayList.implementation;

import stack.StackADT;

import java.util.ArrayList;
import java.util.List;

/**
 * Class StackArrayList<E> implements the StackADT<E> as an adapter to the list.
 *
 * @param <E> The type of elements in the stack.
 */
public class StackArrayList<E> implements StackADT<E> {

    /**
     * The list containing the data
     */
    private List<E> theData;

    /**
     * Construct an empty stack using an ArrayList as the container.
     */
    public StackArrayList() {
        this.theData = new ArrayList<>();
    }

    /**
     * Push an object onto the stack.
     *
     * @param obj The object to be pushed
     * @return The object pushed
     * @post The object is at the top of the stack.
     */
    @Override
    public E push(E obj) {
        theData.add(obj);
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
