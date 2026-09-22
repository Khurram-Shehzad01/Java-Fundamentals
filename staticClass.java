public class staticClass {
    /*
    we made static class as a nested class so that we dont need to make object of the outer class to access innner class if it is static
    a static class can inherits another static class
     */
    static class inner{
        public static void display(){
            System.out.println("you called me without creating object");
        }
    }
    public static void main(String[] args) {
        staticClass.inner.display();
    }
}