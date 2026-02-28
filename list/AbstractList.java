package list;

public abstract class AbstractList<T> implements List<T> {

    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}