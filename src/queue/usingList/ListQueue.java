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
        return 0;
    }

    @Override
    public boolean offer(E item) {
        // Check for empty queue.
        if (isEmpty()) {
            return false;
        }
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
