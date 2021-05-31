/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 31/05/21
 *   Time: 10:12 PM
 *   File: KWSinglyLinkedList.java
 */

package linkedList.singlyLinkedList.implementation;

import linkedList.singlyLinkedList.node.Node;

public class KWSinglyLinkedList<E> {
    //    Reference to the list head. i.e head node
    private Node<E> head = null;

    //    The number of items in the list.
    private int size = 0;

    /* Add an item to the front of the list.
     * @param item The item to be added */
    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    /* Add a node after a given node
     * @param node The node preceding the new item
     * @param item The item to be inserted */
    private void addAfter(Node<E> node, E item) {
        node.setNext(new Node<>(item, node.getNext()));
        size++;
    }
}
