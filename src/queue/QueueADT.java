/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02/09/21
 *   Time: 2:00 PM
 *   File: QueueADT.java
 */

package queue;

import java.util.NoSuchElementException;

/**
 * A queue is a linear data structure which follows a particular order in which the operations are performed.
 * The order is First-In First-Out (FIFO)
 *
 * @param <E> The element type
 */

public interface QueueADT<E> {

    /**
     * Inserts item at the rear of the queue.
     *
     * @param item The item to be inserted
     * @return true if successful, false if the item could not be inserted.
     */
    boolean offer(E item);

    /**
     * Removes the entry at the front of the queue.
     *
     * @return the item removed if the queue is not empty.
     * @throws NoSuchElementException if the queue is empty.
     */
    E remove();

    /**
     * Removes the entry at the front of the queue.
     *
     * @return the item removed if the queue is not empty, null if the queue is empty.
     */
    E poll();

    /**
     * Returns the entry at the front of the queue without removing it.
     *
     * @return the entry at the front of the queue, null if the queue is empty.
     */
    E peek();

    /**
     * Returns the entry at the front of the queue without removing it.
     *
     * @return the entry at the front of the queue
     * @throws NoSuchElementException if the queue is empty.
     */
    E element();

    /**
     * Returns true if the queue is empty; otherwise returns false.
     *
     * @return true (false) if the queue is empty (not empty)
     */
    boolean isEmpty();
}
