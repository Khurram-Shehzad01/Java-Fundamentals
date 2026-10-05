public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Khurram");
        s1.append(" Shehzad");//----------------------------------------------------- 1
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Wajid");
        s2.insert(0," Engineer ");//------------------------------------- 2
        System.out.println(s2);
        s2.insert(s2.length(),"Son of Haneef");//-------------------------------- 2
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder("Mein Germany se mss krna chahta hoo");
        //s3.delete(s3.indexOf("ms"),s3.indexOf("hoo"));//--------------------------------3
        System.out.println(s3);
        int in = s3.lastIndexOf("s");
        s3.deleteCharAt(in);
        System.out.println(s3);
        s3.replace(0,s3.length()-1,s2.toString());//----------------------------4
        System.out.println(s3);
        //String rev =  s3.reverse().toString(); --------------------------------------------5
        //System.out.println(rev);
        char ch = s3.charAt(15);
        System.out.println(ch);
        s3.setCharAt(s3.length()-1, 'c');//---------------------------------------6
        System.out.println(s3);
        int cap = s3.capacity();//-----------------------------------------------------------7
        System.out.println(cap);
        s3.ensureCapacity(51);
        System.out.println(s3.capacity());


    }
}
/*
StringBuildr is a built in class to declare mutable string,StringBuffer is also mutable but the difference is that stringBuilder is thread safe
following are the method of StringBuilder class

1---append()-------->to add string at the end
2---insert()-------->
3---delete()
4---deleteCharAt()
5---replace()
6---reverse()
7---charAt()
8---setCharAt()
9---length()
10---capacity()
11---ensureCapacity()
12---setLength()
13---indexOf()
14---lastIndexOf
15---subString()
16---toString()


 */
