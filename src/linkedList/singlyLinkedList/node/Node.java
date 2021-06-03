/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 31/05/21
 *   Time: 9:55 PM
 *   File: Node.java
 */

package linkedList.singlyLinkedList.node;

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
