public class inheritance {
    /*
    *****************************************************************-----Inheriance--------*************************************
    inheritancee is a way in which we can use the parent class method and its
     */
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.display1();
    }
/*
***********************************************************_____________________________________________________****************************************************8
 */
    int age;
    String name;
    void display1(){
        System.out.println("I am from inheritance class");
    }
    }
    class child extends inheritance{
        void display(){
            System.out.println("I am from child class");
    }
}
