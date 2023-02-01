package Strings;

import java.util.Scanner;

public class basicString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);
//        String month = sc.next();
//        System.out.println(month);
////        length function
//        System.out.println(name.length());
////        conctinanton in string
//        System.out.println(name+month);
////        charAt function
//        System.out.println(name.charAt(0));
//        equality function
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        if (s1==s2) System.out.println("equal");
        else System.out.println("not equal");

        if (s1==s3) System.out.println("equal");
        else System.out.println("not equal");

        if (s1.equals(s3)) System.out.println("equal");
        else System.out.println("not equal");
    }
}
