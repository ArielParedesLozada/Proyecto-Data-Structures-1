package DataStructures;

import java.util.Iterator;

public interface ArrayCosa<T> {
    public Iterator<T> iterator();
    public int size();
    public boolean contains(T element);
}
