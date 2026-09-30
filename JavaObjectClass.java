import java.util.Objects;

public class JavaObjectClass {
    public static void main(String[] args) {
        OM a = new OM("Khurram Shehzad");
        String str = a.toString();
        System.out.println(str);           //-----------------------------------toString()
        OM b = new OM("Khurram");
        boolean c = a.equals(b);// --------------//equals method
        System.out.println(c);
        System.out.println(a.hashCode()==b.hashCode());//---------------------------hashcode()
        System.out.println(b.getClass().getName()+a.getClass().getName());//-------------------------------getClass()

        OM oc =(OM)a.clone();             //clone() method
        System.out.println(oc.name); //overriding output
    }
}
class OM{
    String name;
    final int kyword = 30;
    String str = "Bro";
    OM(String s){
        this.name = s;
    }
    @Override
    public String toString() {
        return "i am override toString() method of the object class";
    }
    @Override
    public boolean equals(Object o) {
        OM om = (OM) o;
        return this.name.equals(om.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name+kyword+str.hashCode());
    }

    @Override
    public Object clone() {
        return new OM(this.name+this.str+this.kyword);
    }
}
/*
java object class is the parent class of all classes we create , inside compiler all classes extends to Object class
We have following methods which belongs to object class

1--toString()   ---------------> return the string representation of the object
2--equals()     ---------------> it compare two object and its reference
3--hashCode()  ----------------> return integer hash code for an object
4--getClass() -----------------> return the run-time class of the object
5--clone()---------------------> create the copy of the object
6--wait()----------------------> makes the current thread to wait
7--notify()--------------------> wakes the current waiting thread
8--notifyAll()-----------------> wakes all the waiting threads
 */
