package DataStructures;

import java.util.Iterator;

public class ArrayMap<T,U> implements ArrayCosa<U>{
    private ArraySet<U> set;
    private T element;

    public ArrayMap(T element){
        this.element = element;
        this.set = new ArraySet<>();
    }

    @Override
    public Iterator<U> iterator() {
        return this.set.iterator();
    }

    public void add(U element){
        this.set.add(element);
    }

    public void remove(U element){
        this.set.remove(element);
    }

    public void setElement(T nuevo){
        this.element = nuevo;
    }

    public T getElement(){
        return this.element;
    }

    @Override
    public boolean equals(Object obj) {
        return this.element == obj;
    }

}
