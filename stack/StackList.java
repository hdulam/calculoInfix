package stack;

import list.List;

public class StackList<T> extends AbstractStack<T> {

    private List<T> list;

    public StackList(List<T> list) {
        this.list = list;
    }

    @Override
    public void push(T item) {
        list.addFirst(item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack vacío");
        size--;
        return list.removeFirst();
    }

    @Override
    public T peek() {
        return list.getFirst();
    }
}