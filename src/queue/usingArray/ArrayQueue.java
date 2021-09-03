/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03/09/21
 *   Time: 11:39 PM
 *   File: ArrayQueue.java
 */

package queue.usingArray;

import queue.QueueADT;

import java.util.AbstractQueue;
import java.util.Iterator;

/**
 * Implements the QueueADT interface using a circular array.
 */
public class ArrayQueue<E> extends AbstractQueue<E> implements QueueADT<E> {

    // Data Fields

    /**
     * Index of the front of the queue.
     */
    private int front;

    /**
     * Index of the rear of the queue.
     */
    private int rear;

    /**
     * Current size of the queue.
     */
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(E e) {
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
