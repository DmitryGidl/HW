package arraylist;

import java.util.Iterator;

// Own collection where it's safe to add new elements but impossible to delete or update
public class UnmodifiableCollection<E> implements MyCollection<E> {
    private E[] values;

    public UnmodifiableCollection() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
