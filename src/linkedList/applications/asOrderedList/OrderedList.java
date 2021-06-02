/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 02/06/21
 *   Time: 7:44 PM
 *   File: OrderedList.java
 */

package linkedList.applications.asOrderedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrderedList<E extends Comparable<E>> implements Iterable<E> {

    /* A list to contain the data. */
    private List<E> theList = new LinkedList<>();

    /* Insert obj into the list preserving the list's order.
     *  @pre The items in the lists are ordered.
     *  @post obj has been inserted into the list
     *         such that the items are still in order.
     *  @param obj The item to be inserted.
     * */
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
            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
