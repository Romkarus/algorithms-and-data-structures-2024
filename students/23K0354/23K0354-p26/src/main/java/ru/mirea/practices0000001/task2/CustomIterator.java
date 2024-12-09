package ru.mirea.practices0000001.task2;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
    Node<T> cursor;

    CustomIterator(CustomList<T> list) {
        cursor = list.getFirst();
    }

    public boolean hasNext() {
        return cursor.getNext() != null;
    }

    public T next() {
        cursor = cursor.getNext();
        return cursor.getData();
    }
}
