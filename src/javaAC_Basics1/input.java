package javaAC_Basics1;
import java.util.*;
//import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
//        String word = sc.next();
//        System.out.println(word);
//        Float price = sc.nextFloat();
//        System.out.println(price);
        System.out.println(sc.next());
        System.out.println(sc.nextShort());
        System.out.println(sc.nextBoolean());
        System.out.println(sc.nextDouble());
    }
}
