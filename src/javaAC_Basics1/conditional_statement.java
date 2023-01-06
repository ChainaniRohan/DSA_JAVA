package javaAC_Basics1;

import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();


//        Largerst of 2

//         if (a > b) {
//             System.out.println("A is greater");
//         }
//         else if(a==b){
//            System.out.println("A & B both are equal");
//        }
//         else {
//             System.out.println("B is greater!");
//         }

//        Largerst of 3
//        if (a>b){
//            if (a > c){
//                System.out.println("A is greatest");
//            }
//            else {
//                System.out.println("c is greatest!");
//            }
//        }
//        else {
//            if (b > c){
//                System.out.println("b is greatest");
//            }
//            else {
//                System.out.println("c is greatest!");
//            }
//        }
//        ternary Operator
        char result = (a>b)? 'a':'b';
        System.out.println(result);
    }
}
