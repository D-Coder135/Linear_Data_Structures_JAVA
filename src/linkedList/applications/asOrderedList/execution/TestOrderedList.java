/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D_Coder135)
 *   Date: 03/06/21
 *   Time: 6:54 PM
 *   File: TestOrderedList.java
 */

package linkedList.applications.asOrderedList.execution;

import linkedList.applications.asOrderedList.implementation.OrderedList;

public class TestOrderedList {
    /**
     * Traverses ordered list and displays each element.
     * Displays an wrror meassage if an element is out of order.
     *
     * @param testList An ordered list of integers
     */
    public static void traverseAndShow(OrderedList<Integer> testList) {
        int prevItem = testList.get(0);

        // Traverse ordered list and display any value that is out of order.
        for (Integer thisItem : testList) {
            System.out.println(thisItem);
            if (prevItem > thisItem) {
                System.err.println("*** FAILED, value is " + thisItem);
            }
            prevItem = thisItem;
        }
    }

    public static void main(String[] args) {
        OrderedList<Integer> testList = new OrderedList<>();
        final int MAX_INT = 500;
    }
}
