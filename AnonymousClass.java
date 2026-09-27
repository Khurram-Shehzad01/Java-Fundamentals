public class AnonymousClass {
    public static void main(String[] args) {
        person p = new person(){
            void display(){
                    System.out.println("i am functon of the anonymous class");
            }
        };
        p.display();
    }

}
class person{
    void display(){
        System.out.println("i am ");
    }
}
/*
nameless class is known as anonymous class,it is used to perform a repeating message or a short or singke line code
 */
