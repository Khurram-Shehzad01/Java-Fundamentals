import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        //****************************** upper bound ****************
//        List<Dog2> ani = new ArrayList<>();
//        ani.add(new Dog2() );
//        ani.add(new Dog2() );
//        fun2(ani);

        //***************** Lower bound **************************************
        List<Animal2> an1 = new ArrayList<>();
        an1.add(new Cat2());
        an1.add(new Dog2());
        System.out.println(an1.size());  //------------> 2
        fun3(an1);
        System.out.println(an1.size());
    }
    //------------------- upper bounds testing -----------------------------
    static void fun2(List<? extends Dog2> values){
        for ( Animal2 animal : values){
            animal.display();
        }
    }
    //----------------------------- lower bound testing --------------
    static void fun3(List<? super Animal2> values){
        values.add(new Dog2());
        values.add(new Dog2());
    }
}
class Animal2 {
     void display(){
        System.out.println("Animal2 class is calling display()");
    }
}
class Dog2 extends Animal2 {
    void display(){
        System.out.println("Dog2 class is calling display()");
    }
}
class Cat2 extends Animal2 {
    void display(){
        System.out.println("Cat2 class is calling display()");
    }
}
/*
wild card "?" and keyword "super " is used with the arraylist passed to a function we will see some example of it
1---- <? extends T>--------------->it means we are implementing upper bounds. it allow to read data and dont allow to write data
2---- <? super T> -----------------> it means we are  implementing lower bounds.it allow to write data only ,we have to used Object class to get read data
 */