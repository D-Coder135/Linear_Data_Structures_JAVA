package linkedList.circular.singly.myInterfaceVersion;

public interface SinglyCircularLinkedListADT<E> {
    void addFirst(E data);

    void addLast(E data);

    E removeFirst();

    boolean isEmpty();

    int size();
}
