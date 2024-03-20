import java.util.Iterator;

import DataStructures.ArraySet;

public class Main {
    public static void main(String[] args) {
        ArraySet<Integer> set = new ArraySet<>();
        for (int i = 0; i < 15; i++) {
            set.add(i);
        }
        Iterator<Integer> lol = set.iterator();
        while (lol.hasNext()) {
            System.out.println(lol.next());
        }
        set.remove(10);
        set.remove(0);
        set.remove(2);
        lol = set.iterator();
        while (lol.hasNext()) {
            System.out.println(lol.next());
        }
    }
}
