package linkedList.circular.singly.myInterfaceVersion;

public interface SinglyCircularLinkedListADT<E> {
    void addFirst(int data);

    void addLast(int data);

    int removeFirst();

    boolean isEmpty();

    int size();
}
