import College.students;

public class packageTestingClass {
    public static void main(String[] args) {
                                             //1st ---Method to call

        // College.students.call();
                                             //2nd Methods to call

        //College.students s =  new College.students();
        //s.call();
        //******************************************---3rd Method is to import relevent package to make object of the class ------*************************

        students a = new students();
        a.publicCall();
        School.students b = new School.students();
        b.publicCall();
    }
}
