/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 26/06/21
 *   Time: 11:03 PM
 *   File: SinglyCircularLinkedList.java
 */

package linkedList.circular.singly.implementation;

import linkedList.circular.singly.myInterfaceVersion.SinglyCircularLinkedListADT;

public class SinglyCircularLinkedList<E> implements SinglyCircularLinkedListADT<E> {

    // The last node reference for the List i.e. the tail reference.
    private Node<E> tail;

    // To store the number of node in the list.
    private int size;

    @Override
    public void addFirst(E data) {
        Node<E> node = new Node<>(data);
        if (isEmpty()) {
            tail = node;
            tail.setNext(node);
        } else {
            node.setNext(tail);
            tail.setNext(node);
        }
        size++;
    }

    @Override
    public void addLast(E data) {
        Node<E> node = new Node<>(data);
        if (isEmpty()) {
            addFirst(data);
        } else {

        }
    }

    @Override
    public int removeFirst() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
