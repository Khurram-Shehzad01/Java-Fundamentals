import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<String>();
        cs.add("A");
        cs.add("B");
        cs.add("C");
        cs.add("D");
        cs.add("E");
        cs.add("F");
        cs.addAll(List.of("A", "B", "C", "D", "E", "F"));
        for(String s : cs) {
            System.out.println(s);
        }
    }

}
/*
collection interfcae aik parent  hai jo sare collection k oopr hota hai baki collection classes isko extends krti hai
or ye iterable interface ko implements krta hai iske apne methods hai

Method ***************************************88	Return type*****************************************	Purpose
add(E e)	                                        boolean                                              	Adds an element
addAll(Collection<? extends E> c)	                boolean	                                                Adds all elements from another collection
clear()	                                            void                                                 	Removes all elements
contains(Object o)	                                boolean	                                                Checks whether an element exists
containsAll(Collection<?> c)	                    boolean	                                                Checks whether all specified elements exist
equals(Object o)	                                boolean	                                                Compares collections according to their equality rules
hashCode()	                                        int	                                                    Returns the hash code
isEmpty()	                                        boolean	                                                Checks whether the collection is empty
iterator()	                                        Iterator<E>	                                            Returns an iterator
remove(Object o)	                                boolean	                                                Removes a matching element, if present
removeAll(Collection<?> c)	                        boolean	                                                Removes elements also present in another collection
removeIf(Predicate<? super E> filter)	            boolean	                                                Removes elements matching a condition
retainAll(Collection<?> c)	                        boolean	                                                Keeps only elements present in another collection
size()	                                            int	                                                    Returns the number of elements
toArray()	                                        Object[]	                                            Converts elements to an object array
toArray(T[] a)	                                    T[]	                                                    Converts elements to a specified array type
toArray(IntFunction<T[]> generator)	                T[]	                                                    Creates an array using a generator
 */
