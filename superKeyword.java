public class superKeyword {
    /*
    Super keyword is used to initialize the parent class user defined constructor
     */


    public static void main(String[] args) {
        superKeyword.child c = new superKeyword.child(22,"Computer Science" ,25 ,"shehzad");
        c.display();
    }
    int age;
    String name;
    superKeyword(int age,String name){
        this.age=age;
        this.name=name;
    }
    static class  child extends superKeyword{
        int num;
        String dept;
        child(int num,String dept,int age,String name){
            super(age,name);
            this.num=num;
            this.dept=dept;
        }
         void display(){
            System.out.println(this.num+this.dept+super.age+ super.name);
        }
    }
}
