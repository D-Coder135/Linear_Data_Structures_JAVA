/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 01/06/21
 *   Time: 1:36 PM
 *   File: KWDoublyLinkedList.java
 */

package linkedList.doubly.implementation;

import linkedList.doubly.node.Node;

public class KWDoublyLinkedList<E> {
    /**
     * This field will store the reference to the first node in the linked list. i.e head
     * */
    private Node<E> head = null;

    /**
     * This field will store the reference to the last node in the linked list. i.e tail
     */
    private Node<E> tail = null;

    /**
     * This field will store the current size of the linked list.
     */
    private int size = 0;

    /**
     * Append item to the end of the list
     *
     * @param item The item to be appended.
     * @return true (as specified by the Collection interface)
     */
    public boolean add(E item) {
        add(size, item);
        return true;
    }

    /**
     * Insert the specified item at index.
     *
     * @param index The position where the item is to be inserted.
     * @param item  The item to be inserted.
     * @throws IndexOutOfBoundsException if index is out of range.
     */
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            // throw the IndexOutOfBoundsException if the index given is incorrect.
            throw new IndexOutOfBoundsException(index);
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node<E> previousNode = getNode(index - 1);
            addAfter(previousNode, item);
        }
    }

    /* Add an item to the front of the list.
     * @param item The item to be added
     * */
    private void addFirst(E item) {
        tail = head = new Node<>(item, null, null);
        size++;
    }

    /**
     * Add a node after a given node
     *
     * @param previousNode The node preceding the new item
     * @param item         The item to be inserted
     */
    private void addAfter(Node<E> previousNode, E item) {
        Node<E> nextNode = previousNode.getNext();
        Node<E> newNode = new Node<>(item, nextNode, previousNode);
        previousNode.setNext(newNode);
        if (nextNode != null) {
            nextNode.setPrev(newNode);
        } else {
            tail = newNode;
        }
        size++;
    }

    public E remove() {
        // remove the last element from the linked list.
        return remove(size - 1);
    }

    public E remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        } else if (index == 0) {
            return removeFirst();
        } else {
            Node<E> previousNode = getNode(index - 1);
            return removeAfter(previousNode);
        }
    }

    private E removeAfter(Node<E> previousNode) {
        E removedValue = null;
        Node<E> nodeToBeRemoved = previousNode.getNext();
        if (nodeToBeRemoved != null) {
            removedValue = nodeToBeRemoved.getData();
            previousNode.setNext(nodeToBeRemoved.getNext());
            size--;
        }
        return removedValue;
    }

    private E removeFirst() {
        E removedValue = null;
        if (head != null) {
            removedValue = head.getData();
            head = head.getNext();
            size--;
        }
        return removedValue;
    }

    /**
     * Find the node at a specified position
     *
     * @param index The position of the node sought
     * @return The node at index or null if it does not exist.
     */
    public Node<E> getNode(int index) {
        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public String toString() {
        StringBuilder listString = new StringBuilder();
        Node<E> currentNode = head;
        listString.append("[");
        for (int i = 0; i < size; i++) {
            if (currentNode != null) {
                listString.append(currentNode.getData());
                currentNode = currentNode.getNext();
            }
            if (i < size - 1) {
                listString.append(", ");
            }
        }
        listString.append("]");
        return listString.toString();
    }
}
