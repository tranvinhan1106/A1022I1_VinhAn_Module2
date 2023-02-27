package ss10_dsa_to_java.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        this(DEFAULT_CAPACITY);
    }


    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            Object[] newElements = new Object[size * 2];
            System.arraycopy(elements, index, newElements, 0, size);
            elements = newElements;
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object removeElement = new Object[index];
        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[--size] = null;
        return (E) removeElement;
    }

    public int size() {
        return size;
    }

    public E clone() throws CloneNotSupportedException {
        MyList<E> cloneList = new MyList<E>(this.size());
        cloneList.elements = elements.clone();
        cloneList.size = size;
        return (E) cloneList;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            Object[] newElement = new Object[newCapacity];
            System.arraycopy(elements, 0, newElement, 0, size);
            elements = newElement;
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index:" + i + ",Size" + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
