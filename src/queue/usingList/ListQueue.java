/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02/09/21
 *   Time: 4:30 PM
 *   File: ListQueue.java
 */

package queue.usingList;

import queue.QueueADT;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implements the Queue interface using a singly-linked list.
 */
public class ListQueue<E> extends AbstractQueue<E> implements QueueADT<E> {

    // Data Fields
    /**
     * Reference to the front of the queue.
     */
    private Node<E> front;

    /**
     * Reference to the rear of the queue.
     */
    private Node<E> rear;

    /**
     * Size of the queue.
     */
    private int size;

    // Inner class Node<E> for singly-linked list.
    public class Node<E> {
//    Data Fields

        /* The reference to the data. */
        private E data;

        /* The reference to the next node. */
        private Node<E> next;

//    Constructors

        /**
         * Creates a new node with null next field.
         *
         * @param data The data stored
         */

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        /**
         * Creates a new node that references another node.
         *
         * @param data The data stored
         * @param next The node reference by new node
         */

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean offer(E item) {
        // Check for empty queue.
        if (isEmpty()) {
            return false;
        } else {
            if (front == null) {
                rear = new Node<>(item);
                front = rear;
            } else {
                // Allocate a new node at end, store item in it, and link it to old end of the queue.
                rear.next = new Node<>(item);
                rear = rear.next;
            }
            size++;
            return true;
        }
    }

    @Override
    public E poll() {
        E item = peek();
        // Retrieve item at front.
        if (item == null) {
            return null;
        }
        // Remove item at front.
        front = front.next;
        size--;
        return item;
    }

    @Override
    public E remove() {
        E item = peek();
        // Retrieve item at front.
        if (item == null) {
            throw new NoSuchElementException();
        }
        // Remove item at front.
        front = front.next;
        size--;
        return item;
    }

    @Override
    public E element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return front.data;
    }
}
