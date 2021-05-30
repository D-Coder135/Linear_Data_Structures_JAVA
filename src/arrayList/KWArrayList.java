/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 30/05/21
 *   Time: 3:04 PM
 *   File: KWArrayList.java
 */

package arrayList;

public class KWArrayList<E> {
    //Data Fields

    /*The default initial capacity*/
    private static final int INITIAL_CAPACITY = 10;

    /*The underlying data array*/
    private E[] theDataArray;

    /*The current size*/
    private int size = 0;

    /*The current capacity*/
    private int capacity = 0;

    public KWArrayList() {
        capacity = INITIAL_CAPACITY;
        theDataArray = (E[]) new Object[capacity];
    }

    public boolean add(E anEntry) {
        if (size == capacity) {
            reallocate();
        }
        theDataArray[size++] = anEntry;

    }
}
