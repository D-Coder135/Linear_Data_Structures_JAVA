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
        System.out.println(circularLinkedList.size());
        circularLinkedList.addFirst(20);
        circularLinkedList.addLast(50);
        circularLinkedList.addFirst(30);
        circularLinkedList.addFirst(40);
    }
}
