/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 27/06/21
 *   Time: 11:27 PM
 *   File: Main.java
 */

package linkedList.circular.singly.execution;

import linkedList.circular.singly.implementation.SinglyCircularLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyCircularLinkedList<Integer> circularLinkedList = new SinglyCircularLinkedList<>();
        System.out.println("Initial Size of the List: " + circularLinkedList.size());
        circularLinkedList.addFirst(20);
        circularLinkedList.addLast(50);
        circularLinkedList.addFirst(30);
        circularLinkedList.addFirst(40);
        circularLinkedList.addLast(60);
        System.out.println("After performing Insertion operation, Size = " + circularLinkedList.size());
        System.out.println("Removing the first element of the list i.e = " + circularLinkedList.removeFirst());
        System.out.println("List after performing all the operations => ");

    }
}
