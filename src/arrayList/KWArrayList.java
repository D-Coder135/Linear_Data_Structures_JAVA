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
        return true;
    }

    public void add(int index, E anEntry) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (size == capacity) {
            reallocate();
        }
//        Shift data in elements from the index to size - 1
        for (int i = size; i > index; i--) {
            theDataArray[i] = theDataArray[i - 1];
        }
//        Insert the new item
        theDataArray[index] = anEntry;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theDataArray[index];
    }

    public E set(int index, E newValue) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E oldValue = theDataArray[index];
        theDataArray[index] = newValue;
        return oldValue;
    }
}
