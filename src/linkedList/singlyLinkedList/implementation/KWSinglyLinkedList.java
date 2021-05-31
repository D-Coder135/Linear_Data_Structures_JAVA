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

    /* Insert the specified item at index.
     * @param index The position where the item is to be inserted.
     * @param item The item to be inserted.
     * @throws IndexOutOfBoundsException if index is out of range.
     * */
    public void add(int index, E item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }

    /* Append item to the end of the list
     * @param item The item to be appended.
     * @return true (as specified by the Collection interface)
     * */
    public boolean add(E item) {

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
        if (temp != null) {
            size--;
            return temp.getData();
        } else {
            return null;
        }
    }

    /* Find the node at a specified position
     * @param index The position of the node sought
     * @return The node at index or null if it does not exist.
     * */
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.getNext();
        }
        return node;
    }

    /* Get the data at index
     * @param index The position of the data to return
     * @return The data at index
     * @throws IndexOutOfBoundsException if index is out of range
     * */
    public E getData(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.getData();
    }

    /* Store a reference to anEntry in the element at position index.
     * @param index The position of the item to change.
     * @param newValue The new data
     * @return The data previously stored at index.
     * @throws IndexOutOfBoundsException if index is out of range
     * */
    public E setData(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.getData();
        node.setData(newValue);
        return result;
    }
}
