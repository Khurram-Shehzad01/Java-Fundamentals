public class staticMethod {
   /* A static method is a method that belongs to the class itself, not to any specific object (instance) of the class.
   Important Rules

A static method can call other static methods and access static variables.
A static method cannot directly access non-static (instance) variables or methods.
You can access static methods from an instance, but it’s not recommended:
    */
public static void main(String[] args) {
    employee.setDetails("Shehzad",25,1);
    System.out.println(employee.name + " " + employee.age+" "+ employee.empID);
    employee.setDetails("Hafiz Faisal",24,2);
    System.out.println(employee.name + " " + employee.age+" "+ employee.empID);
  }
   static class employee{
    static String name;
    static int age;
    static int empID;
    static void  setDetails (String name, int age, int empID){
        employee.name = name;
        employee.age = age;
        employee.empID = empID;

    }

  }
}
/*
**************************************************----------Note------------***************************
we make static methods so that we can access them without creating the object of class which they belong to
 */
