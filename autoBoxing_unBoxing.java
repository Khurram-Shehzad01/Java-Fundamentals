public class autoBoxing_unBoxing {
    /*
    1--autoboxing means we convert primitive int to wrapper class Integer i.e int x = 10;---->Integer y = x;

    2--unboxing refer to change from wrapper class Integer to int i.e Integer y = 100;--> int s = y;

    *************************************----------Methods-----------------------*************************
    1--assigments
    2--method calls
    3--arithmatic operators
     */


    public static void main(String[] args) {
        /*
        **************************************------------Assignments----------------*********************
         */

        int x = 10;
        Integer y = 10;        //AutoBoxing
        System.out.println(x);
        System.out.println(y);

        Integer a =  100;
        int b = a;            //unboxing
        System.out.println(b);

        /*
        ******************************************---------methods Calss-------------------************************
         */
        int c = 199;
        autoBoxing_unBoxing.giveBack(c);
        System.out.println(c);

        int d = 271;
        Integer e = 200;
        System.out.println(d+d);
    }
    static int giveBack(Integer a){
        return a;
    }
}
