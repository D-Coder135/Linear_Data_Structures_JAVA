/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 01/06/21
 *   Time: 1:36 PM
 *   File: KWDoublyLinkedList.java
 */

package linkedList.doublyLinkedList.implementation;

import linkedList.doublyLinkedList.node.Node;

public class KWDoublyLinkedList<E> {
    /*
     * This field will store the reference to the first node in the linked list. i.e head
     * */
    private Node<E> head = null;

    /*
     * This field will store the reference to the last node in the linked list. i.e tail
     * */
    private Node<E> tail = null;

    /*
     * This field will store the current size of the linked list.
     * */
    private int size = 0;

    /* Append item to the end of the list
     * @param item The item to be appended.
     * @return true (as specified by the Collection interface)
     * */
    public boolean add(E item) {
        add(size, item);
        return true;
    }

    /* Insert the specified item at index.
     * @param index The position where the item is to be inserted.
     * @param item The item to be inserted.
     * @throws IndexOutOfBoundsException if index is out of range.
     * */
    public void add(int index, E item) {
        if (index < 0 || index > size) {

        }
    }
}
