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
