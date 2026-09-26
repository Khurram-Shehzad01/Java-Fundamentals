import java.util.Scanner;

public class NestedInnerClass {
    public static void main(String[] args) {
        NestedInnerClass.name = "shehzad";
        NestedInnerClass ni = new NestedInnerClass();
        ni.displayName();
        NestedInnerClass.inner in = ni.new inner();
        ni.displayName();

    }






    private static String name ;
    void displayName(){
        System.out.println(this.name);
    }
    class inner{
        //private String name;
        void displayName(){
            System.out.println(NestedInnerClass.this.name);
        }

    }
}
/*
A non-static inner class
 */