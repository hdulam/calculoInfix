package list;

public class DoublyLinkedList<T> extends AbstractList<T> {

    private Node<T> head;
    private Node<T> tail;

    @Override
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) throw new RuntimeException("Lista vacía");
        T data = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        size--;
        return data;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) throw new RuntimeException("Lista vacía");
        return head.data;
    }
}