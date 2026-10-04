import java.util.Arrays;

public class JavaStringsAndMethods {
    public static void main(String[] args) {
        String s1 = new String("Shehzad");
        String s2 = "Shehzad";
        System.out.println(s1 == s2); //false because s1 created in heap and s2 located in string pool memory
        //************************************-----.length()-----*****************************
        //return the length of the string
        System.out.println(s1.length()); //---------7

        /*
        **************************---charAt()---->return character at a specific index
         */
        System.out.println(s1.charAt(6));//-------- d -------> we have to specify index of the character firs

        /*
        *************************-----subString()---------->to make new string of any part of string or to extract a part from string
         */
        System.out.println(s1.substring(3,6)); //--------> hza

        /*
        ************************-------equlas()---->compare values of two string if they are equal or not
         */
        System.out.println(s1.equals(s2));//-----------> true
        /*
        ***********************equalsGnoreCase()--------> compares strings and ignores upper/lowercase
         */
        String s3 = "shehzaD";
        String s4 = "SHEHZAD";
        System.out.println(s3.equalsIgnoreCase(s4));  //----------------> true
        /*
        ***********************--------compareTo()--------->Lexicographically compares two values
        * 0---equals
        * 1---negative means first string come first and second afte it
        * 2--positive means first string comes after second string
         */
        System.out.println(s3.compareTo(s4));  //    ------->-32
        /*
        ********************--------compareToIgnoreCase()--->compare by ignoring cases
         */
        System.out.println(s3.compareToIgnoreCase(s4)); //-----> 0
        /*
        *******************-----toUpperCase() and toLowerCase()------>converts string into upper/lower case
         */
        System.out.println(s3.toUpperCase());//------------------->SHEHZAD
        System.out.println(s4.toLowerCase());//------------------->shehzad
        /*
        **************---------trim() and strip()---->trim is ised to remove whitespaces adn strip is modern unicode and remove trailing and leading
         */
        String s5 = "   Hallo   ";
        System.out.println(s5.trim());
        String lead = s5.stripLeading();
        String trail = s5.stripTrailing();
        System.out.println(lead.length());
        System.out.println(trail.length());
        /*
        **************************-----------contains()----> return if a string contain a particular sequence
         */
        String s6 = "My My name is Khurram Shehzad and i am a web developer and i am a good person";
        System.out.println(s6.contains("Khurram"));//--------->true
        /*
        *******************------------------------startswith() and endWith();
         */
        System.out.println(s6.startsWith("My"));//---------------->true it is case sensitive
        /*
        **************************-----------------------indexOf() and lastIndexOf()----->return the index of first matching sequence or character from left to right and
        * lastindexof return the last matching sequene from left to right
         */
        System.out.println(s6.indexOf("name")); //---->3
        System.out.println(s6.lastIndexOf("name"));//--->8
        /*
        *************************-------------replace(), replaceFirst(),  replaceAll()--->replace() method takes two parameters one is index and second is character or character sequnce
        * other two functions takes two oarameters of chararcter sequnce
         */
       // System.out.println(s6.replace("name","surname"));               //----->it replaces all the char sequencence found in string

       String s7 = s6.replaceFirst("My","our");    //only replaces the first match regex
        System.out.println(s7);

        System.out.println(s6.replaceAll("and",",")); //and will be replaced by ,

        /*
        **************---------------------concat(),isEmpty(),isBlank(),split(),format------> to join two strings,check if string is empty
         */
         String s8 = "  ";
        System.out.println(s8.concat(s1));
        System.out.println(s8.isEmpty());
        System.out.println(s8.isBlank());
        System.out.println(s1.getBytes());
        String name = "Khurram";
        int age = 25;

        String s = String.format("Name: %s, Age: %d", name, age);

        System.out.println(s);
        System.out.println(Arrays.stream(s6.split("khurram",12)).toArray());

    }
}

/*
1--Strings are immutable data types we can declare strings with two methods 1--Literals and 2--with new operatirs
2-- we can use StringBuilder and StringBuffer to intialize string but these are mutables
3--Strings initialized with lietrals will get memory in strings pools while intialized with new operator will get memory into Heap Memory
--------------***************************** we will discuss methods of the strings one by one------------------****************************
 */

