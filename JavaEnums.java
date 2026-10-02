public class JavaEnums {
    public static void main(String[] args) {
        int d = Directions.RIGHT.getDegree();
        System.out.println(d);
    }

}
enum Directions{
    LEFT(22){
        @Override
        void display() {};
    },
    RIGHT(22){
        @Override
        void display() {};
    },
    UP(24){
        @Override
        void display() {};
    },
    DOWN(26){
        @Override
        void display() {};
    };
      int degree;
    Directions(int d) {
      this.degree = d;
    }
    abstract void display();
    public int getDegree() {
        return degree;
    }
}
/*
Java enums also called enumeration,it is used to make a set of constant,it act as constants enclosed in a enum class the value cannot be modified
an enum will have variables which act as a objects of the enum class ,there value cannot be change
-----it can have methods and variables
------we can use all methods of Object class
 */
