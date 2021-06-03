/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 02/06/21
 *   Time: 7:44 PM
 *   File: OrderedList.java
 */

package linkedList.applications.asOrderedList.implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrderedList<E extends Comparable<E>> implements Iterable<E> {

    /* A list to contain the data. */
    private List<E> theList = new LinkedList<>();

    /**
     * Insert obj into the list preserving the list's order.
     *
     * @param obj The item to be inserted.
     * @pre The items in the lists are ordered.
     * @post obj has been inserted into the list
     * such that the items are still in order.
     */
    public void add(E obj) {
        ListIterator<E> iter = theList.listIterator();
        // Find an insertion point and insert.
        while (iter.hasNext()) {
            if (obj.compareTo(iter.next()) < 0) {
                // Iterator has stepped over the first element
                // that is greater than the element to be inserted.
                // Move the iterator back one.
                iter.previous();

                // Insert the element.
                iter.add(obj);
                // Exit the loop and return.
                return;
            }
        }
        // assert: All items were examined and no item is larger than the element to be inserted.
        // Add the new item to the end of the list.
        iter.add(obj);
    }

    /**
     * Returns an iterator to this OrderedList.
     *
     * @return The iterator, positioning it before the first element
     */
    @Override
    public Iterator<E> iterator() {
        return theList.iterator();
    }

    /**
     * Returns the element at the specified position.
     *
     * @param index The specified position
     * @return The element at position index
     */
    public E get(int index) {
        return theList.get(index);
    }

    /**
     * Returns the size of the list.
     *
     * @return the size of the list
     */
    public int size() {
        return theList.size();
    }

    /**
     * Removes first occurrence of obj from the list.
     *
     * @param obj The element to be removed from the list
     * @return true if the list contained object obj otherwise, returns false
     */
    public boolean remove(E obj) {
        return theList.remove(obj);
    }
}
