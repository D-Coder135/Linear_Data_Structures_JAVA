/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 01/06/21
 *   Time: 1:15 PM
 *   File: Node.java
 */

package linkedList.doublyLinkedList.node;

// A Node is the building block for a double-linked list.
public class Node<E> {
    /* The data value. */
    private E data;

    /* The link to the next node. */
    private Node<E> next;

    /* The link to the previous node. */
    private Node<E> prev;

    /* Constructor a node with the given data value.
     * @param data The data value.
     * */
    public Node(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    /* Constructor a node with the given data value and references to the next and previous nodes.
     * @param data The data value.
     * @param next The next node.
     * @param prev The previous node.
     * */
    public Node(E data, Node<E> next, Node<E> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
