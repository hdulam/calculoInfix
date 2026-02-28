package stack;

import java.util.Vector;

public class StackVector<T> extends AbstractStack<T> {

    private Vector<T> list = new Vector<>();

    @Override
    public void push(T item) {
        list.add(item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack vacío");
        size--;
        return list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack vacío");
        return list.lastElement();
    }
}