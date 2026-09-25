public class NestedStaticClass {
    public static void main(String[] args) {
        outer out = new outer();
        outer.inner.display(out);
    }
}
class outer{
    private static int i = 30;
    final String s = "Hello";
    static private void display() {
        System.out.println("static method calling of outer class");
    }
    static class inner{
       static void display(outer out){

            System.out.println(i);
            System.out.println(out.s);
            out.display();

        }
    }

}
/*
nested static class inside an outer normal class ,it act like a normal class following are the attributes of the class

 */