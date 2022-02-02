package tools;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator {

    private Object[] items;
    private int position;

    public ArrayIterator(Object[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public Object next() {
        if (position >= items.length) {
            throw new NoSuchElementException();
        }
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
