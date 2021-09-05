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
    private int size;

    /**
     * Current capacity of the queue.
     */
    private int capacity;

    /**
     * Default capacity of the queue.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Array to hold the data.
     */
    private E[] theData;

    // Constructors

    /**
     * Construct a queue with the default initial capacity.
     */
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    /**
     * Construct a queue with the specified initial capacity.
     *
     * @param initCapacity The initial capacity
     */
    public ArrayQueue(int initCapacity) {
        capacity = initCapacity;
        theData = (E[]) new Object[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }

    // Public Methods
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
        if (size == capacity) {
            reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        theData[rear] = item;
        return true;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        } else {
            return theData[front];
        }
    }
}
