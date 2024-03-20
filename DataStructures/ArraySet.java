package DataStructures;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySet<T> implements ArrayCosa<T>{
    private T[] set;
    private int count;

    public ArraySet() {
        this.set = (T[]) new Object[10];
        this.count = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.asList(set).iterator();
    }

    private void expand() {
        T[] nuevo = (T[]) new Object[this.count + 5];
        for (int i = 0; i < this.set.length; i++) {
            nuevo[i] = this.set[i];
        }
        this.set = nuevo;
    }

    private void trim() {
        T[] nuevo = (T[]) new Object[this.count];
        int j = 0;
        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i] != null) {
                nuevo[j++] = this.set[i];
            }
        }
        this.set = nuevo;
    }

    public void add(T element) {
        if (this.count == this.set.length) {
            expand();
        }
        this.set[this.count] = element;
        this.count++;
    }

    public boolean remove(T element) {
        for (int i = 0; i < this.count; i++) {
            if (this.set[i].equals(element)) {
                this.set[i] = null;
                this.count--;
                trim();
                return true;
            }
        }
        return false;
    }

    public boolean contains(T element) {
        for (int i = 0; i < this.count; i++) {
            if (this.set[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.count;
    }
}
