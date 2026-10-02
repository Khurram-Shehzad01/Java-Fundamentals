import java.util.Optional;

public class JavaInterfaces{
    public static  void main(String[] args){
        C c1 = new C();
        c1.display();
        c1.greet();

    }
}
interface  A{
    int a=23;
    void display();
}
interface B{
    void display();
     void greet();
}
class C implements A,B{
    @Override
   public void display() {
        System.out.println(" i am methhod of interface A");
    }
    @Override
    public void greet() {
        System.out.println(" i am methhod of interface B");
    }
}
/*
interfaces are second way of implemention of abstraction after abstract classes
---we can implement multiple inheritance hrough interfaces
---we cannot implement multiple inheritance throuhg classes because classes raised diamond problem
 */