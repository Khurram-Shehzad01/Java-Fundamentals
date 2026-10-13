
import java.util.*;

public class ListCF {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1,5);
        list.addAll(List.of(3,4));
//        final Integer it = list.get(list.lastIndexOf(4));

        System.out.println(it);
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
/*
List is collection framework to store any type of data in a list form one after another,list has the following type
of data structure for storing
1--LinkedList ---->data will be linked ,data will be stored in a index
2--ArrayList------->data will be store in a contagious memory location
3--Vector

add(E e)------------------------------------------------------------Adds an element to the end
add(int index, E element)-------------------------------------------Inserts an element at an index
addAll(Collection<? extends E> c)-----------------------------------Adds all elements from another collection
addAll(int index, Collection<? extends E> c)------------------------Inserts all elements at an index
get(int index)------------------------------------------------------Returns the element at an index
set(int index, E element)-------------------------------------------Replaces an element at an index
remove(int index)---------------------------------------------------Removes the element at an index
remove(Object o)----------------------------------------------------Removes the first matching element
indexOf(Object o)---------------------------------------------------Returns the first matching index
lastIndexOf(Object o)-----------------------------------------------Returns the last matching index
listIterator()------------------------------------------------------Returns a bidirectional iterator
listIterator(int index)---------------------------------------------Returns an iterator starting at an index
subList(int fromIndex, int toIndex)---------------------------------Returns a view of a range
replaceAll(UnaryOperator<E> operator)-------------------------------Replaces each element using an operation
sort(Comparator<? super E> c)---------------------------------------Sorts the list
spliterator()------------------------------------------------------	Returns a spliterator for traversal
 */
