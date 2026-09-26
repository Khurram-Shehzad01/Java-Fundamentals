import java.util.Locale;

public class LocalClass {
    public static void main(String[] args) {
        LocalClass  l =  new LocalClass();
        l.display();

    }
    void display(){
        class local{
        void gree(){
            System.out.println("Hello World");
        }
        }
        local  l = new local();  //remember that we created object of the class after the function where the local class reside
        l.gree();
    }
}
/*
Any class created inside if-else or any method block known as local class
 */