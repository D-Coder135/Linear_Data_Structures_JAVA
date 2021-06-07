/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 07/06/21
 *   Time: 8:48 PM
 *   File: LinkedListStack.java
 */

package stack.usingLinkedList.implementation;

import stack.StackADT;

/**
 * Class to implement interface StackADT as a linked list.
 */
public class LinkedListStack<E> implements StackADT<E> {

//    Inner class Node<E>.
private static class Node<E> {

    /* The reference to the data. */
    private E data;

    /* The reference to the next node. */
    private Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

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

    /* Data Fields */

    /**
     * The reference to the first stack node.
     */
    private Node<E> topOfStackRef = null;

    /**
     * Insert a new item on top of the stack.
     *
     * @param obj The item to be inserted
     * @return The item that was inserted.
     * @post The new item is the top item on the stack.
     * All other items are ine position lower.
     */
    @Override
    public E push(E obj) {
        topOfStackRef = new Node<>(obj, topOfStackRef);
        return obj;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
