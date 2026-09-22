public class staticVariables {
/*
static keyword
The static keyword or variables means the member belongs to the class itself, not to any specific object (instance) of the class.we can call it by class
i.e "student.collge".static variable will be shared among all objects of the class.static variable cannot be pointed to any object
 */
    public  void main(String[] args) {
        student.college = "KIPS College";
        student s1 = new student("khurram shehzad",25);
        System.out.println(s1.name + " " + s1.college+" "+s1.age);
        student s2 = new student("Hafiz Nadeem",29);
        System.out.println(s2.name + " " + s2.college+" "+s2.age);

    }
class student{
        String name;
        int age;
        static String college;
        student(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
}
