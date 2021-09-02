package queue;

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

}
