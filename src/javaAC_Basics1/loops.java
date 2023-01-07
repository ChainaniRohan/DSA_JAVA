package javaAC_Basics1;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        print 1 to n

//        int cnt = 1;
//        int range = sc.nextInt();
//        while (cnt <= range){
//            System.out.print(cnt);
//            cnt ++;
//        }

//        print sum of 1 to n
//        int i = 1;
//        int n = sc.nextInt();
//        int sum = 0;
//        while (i <= n){
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);

//        for loops
//        for (int i = 1; i < 11; i++){
//            System.out.println("Hello World!");
//        }
//        prnt squrare pattern
//        for (int i = 1; i <= 4; i++){
//            System.out.println("****");
//        }
//        int line = 1;
//        while (line <= 4){
//            System.out.println("****");
//            line++;
//        }
//        print reverse of a Number
//        int n = sc.nextInt();
//        while (n > 0){
//            int lastDigit = n%10;
//            System.out.print(lastDigit + "");
//            n /= 10;
//        }

//        Do While
//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n < 11);

//        Break Statement
//        for (int i = 1; i < 5;i++){
//            System.out.println(i);
//            if(i == 4){
//                break;
//            }
//        }
//                System.out.println("im out");

//        print until no entered is multiple of 10
//        do {
//            int n = sc.nextInt();
//            if (n%10==0){
//                break;
//            }
//            System.out.println(n);
//        }while (true);

//        continoue if no is multiple of 10
        do {
            int n = sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println(n);
        }while (true);
    }
}
