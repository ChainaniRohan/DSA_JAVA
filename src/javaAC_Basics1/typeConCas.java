package javaAC_Basics1;

import java.util.Scanner;

public class typeConCas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        type conversion
        int a = 5;
        long b = a;
        System.out.println(b);
//        type casting
        long c = 45;
//        int d = c; //this wont work as we are tyring the bigger data into smaller;
        int d = (int)c;
        System.out.println(d);

//        type casting for characters to int
        char ch = 'a';
        int num = ch;
        System.out.println(ch+" : "+num);
    }
}
