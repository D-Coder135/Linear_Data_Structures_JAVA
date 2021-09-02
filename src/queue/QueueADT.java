package queue;

/**
 * A queue is a linear data structure which follows a particular order in which the operations are performed.
 * The order is First-In First-Out (FIFO)
 *
 * @param <E> The element type
 */

public interface QueueADT<E> {

    boolean offer(E item);

}
