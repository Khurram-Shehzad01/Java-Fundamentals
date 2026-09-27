import java.util.Scanner;

public class JavaScannerClass {
    public static void main(String[] args) {
        String name ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}
/*
Scanner class allow us to read inputs of any data by the user
 */
