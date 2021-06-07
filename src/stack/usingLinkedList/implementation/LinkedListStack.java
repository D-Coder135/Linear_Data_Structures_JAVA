/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 07/06/21
 *   Time: 8:48 PM
 *   File: LinkedListStack.java
 */

package stack.usingLinkedList.implementation;

import stack.StackADT;

import java.util.NoSuchElementException;

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

    /**
     * Returns the top item on the stack.
     *
     * @return The top item on the stack
     * @throws NoSuchElementException if the stack is empty.
     * @pre The stack is not empty.
     * @post The stack remains unchanged.
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return topOfStackRef.data;
        }
    }

    /**
     * Remove and return the top item on the stack.
     *
     * @return The top item on the stack
     * @throws NoSuchElementException if the stack is empty.
     * @pre The stack is not empty.
     * @post The top item on the stack has been removed and the stack is ont item smaller.
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
