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

}
