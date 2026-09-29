public class ImmutableClass {
    public static void main(String[] args) {
        College c = new College("Kips College","Lahore-Cmapus");
        Students s = new Students("Khurram Shehzad",24,c);
        System.out.println(s.getName());
        System.out.println(s.getCollege().name);
       // s.getCollege().name = "Punjab College";    this wll throw an error
        System.out.println(s.getCollege().name);
    }
}
final class Students{
    final private String name;
    final private int age;
    final private College coll;
    Students(String name, int age, College col) {
        this.name = name;
        this.age = age;
        this.coll = col;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public College getCollege(){
        return this.coll;
    }
}
class College{
    final String name;
    String address;
    College(String name,String address){
        this.name = name;
        this.address = address;
    }
}
/*
Today iw ill practice how to make a class immutable ,immutable means we cnnot change value of its data member
 */