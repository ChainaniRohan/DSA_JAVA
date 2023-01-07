package javaAC_Basics1;

import java.util.Scanner;

public class project03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println(fact);


//        for (int i = 1; i < 11; i++){
//            System.out.println(n+" X "+i+" = "+n*i);
//        }

//        int even = 0;

//            if (num%2==0){
//                even+=num;
//            }
//            else {
//                odd += num;
//            }
//            System.out.println("Do you want to continoue? 1 for yes & 0 for no");
//            choice = sc.nextInt();
//        } while (choice == 1);
//
//        System.out.println("even Num = "+even);
//        System.out.println("odd Num = "+odd);
    }
}
