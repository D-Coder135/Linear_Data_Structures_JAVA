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

    /* Remove the node after a given node
     * @param node The node before the one to be removed
     * @return The data from the removed node, or null if there is no node to remove.
     * */
    private E removeAfter(Node<E> node) {
        Node<E> temp = node.getNext();
        if (temp != null) {
            node.setNext(temp.getNext());
            size--;
            return temp.getData();
        } else {
            return null;
        }
    }

    /* Remove the first node from the list
     * @return The removed node's data or null if the list is empty.
     * */
    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        // Return data at old head or null if the list is empty.
    }
}
