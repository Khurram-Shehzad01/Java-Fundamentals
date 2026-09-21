public class inheritance {
    /*
    *****************************************************************-----Inheriance--------*************************************
    inheritancee is a way in which we can use the parent class method and its
    -----------------inheritance types---------------
    * 1--simples
    * 2--multi-level----A-->B-->C (A is parent of B and B is the parnt of c c can access all the properties of A nd B)
    * 3--hierchical-----    A is the parents of both B and C
    *                        `
    * 4--multiples-----java does not support it
     */
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.display1();
        grandChild gg = new grandChild();
        gg.display1();
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
class grandChild extends child {
    void display(){
        System.out.println("I am from grandChild class");
    }
}
