public class polymorphism {
    /*
    polymorphism is a oop concept in which a mehod change its states according to the class, it can be implemented in two ways mostly
    1--method overloading
    2--method overriding
    3--constructor overloading------>not used much
     */
    public static void main(String[] args) {
        String call = "cat";
        if(call.equals("dog")){
            Animal a = new dog();
            a.eat();
        }
        else if(call.equals("cat")){
            Animal a = new cat();
            a.eat();
        }
        else{
            System.out.println("Invalid Parameters");
        }
    }

}
class Animal {
    public void eat(){
        System.out.println("Animal eats");
    }
}
class dog extends Animal {
    public void eat(){
        System.out.println("Dog eats");
    }
}
class cat extends Animal {
    public void eat(){
        System.out.println("cat eats");
    }
}
