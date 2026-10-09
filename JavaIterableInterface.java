import java.util.*;

public class JavaIterableInterface {
    public static void main(String[] args) {
        String[] names = {"Khurram","Shehzad","wajid","Haneef"};
        NamesContainer nc = new NamesContainer(names);
        Iterator i = nc.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


class NamesContainer implements Iterable<String> {
    private String[] names;
    private int index;
    public NamesContainer(String[] names) {
        this.names = names;
    }
    @Override
    public Iterator<String> iterator() {
        return new NamesIterator();
    }
    private class NamesIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return index < names.length;
        }
        @Override
        public String next() {
            return names[index++];
        }
    }
}



/*
  Every collection framework of java implements Iterable interface we will se an example whre we
  implements iterable interface ,it has method
 */
