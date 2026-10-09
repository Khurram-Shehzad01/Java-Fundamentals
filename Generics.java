public class Generics {
  public static void main(String[] args) {
      //Generics gn = new  Generics();
      //
      // gn.display("Shehzad",25);
//      Animals b = new Animals();
//      GenericsClass<Animals> a = new GenericsClass<>();
//      a.value = b;
//      Animals c = a.val();
//      c.display();
      //uppeer bounds: extends and implements used in GenericClass is called upper bounds

      //GenericsClass<Dog1> d =  new GenericsClass<>(); //-----------------> we cannot do it because of upper bound
      GenericsClass <Cat1> c1 = new GenericsClass();
  }
  public<X,Y> void display(X i,Y n){
      X name = i;
      Y age = n;
      System.out.println(name);
      System.out.println(age);
  }
}
class GenericsClass<T extends Animals & in>{
    T value;
    public T val(){
        return value;
    }
}
interface in{
    void fly();
}
class Animals{
    void display(){
      System.out.println("Animals");
    }
}
class Dog1 extends Animals{
    void display(){
    System.out.println("Dog");
    }
}
class Cat1 extends Animals implements in{
    void display(){
        System.out.println("Cat");
    }
    @Override
    public void fly() {
        System.out.println("cats can  fly");
    }
}
/*
java generics allow us to work with class that can take different types of data elemets it allow us to make
1--generic class
2--generic functions
3--generic variables
 */
