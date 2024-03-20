package DataStructures;

public class ArrayMap<T,U> {
    public ArraySet<U> set;
    private T element;

    public ArrayMap(T element){
        this.element = element;
        this.set = new ArraySet<>();
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
