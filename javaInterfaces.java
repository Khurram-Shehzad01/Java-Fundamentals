public class javaInterfaces {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }


}
interface inter{
    void display();
}
class A implements inter{
    public void display(){
        System.out.println("interface implemented");
    }
}