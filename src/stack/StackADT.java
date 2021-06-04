/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 04/06/21
 *   Time: 8:12 PM
 *   File: StackADT.java
 */

package stack;

/**
 * A Stack is a data structure in which objects are inserted into and remove fromt
 * the same end (i.e., Last-In, First-Out).
 *
 * @param <E> The element type
 */

public interface StackADT<E> {

    E push(E obj);

    E peek();
}
