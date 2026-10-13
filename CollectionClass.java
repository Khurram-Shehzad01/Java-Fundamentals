import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionClass {
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
 */
