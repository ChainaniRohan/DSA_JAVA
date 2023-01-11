package javaAC_Basics1;

import java.util.Scanner;

public class checkPrime {
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        if (n==2){
            return true;
        }
        else {
//            for (int i = 2; i < Math.sqrt(n); i++){   Optimised Soln
            for (int i = 2; i < n; i++){
                if (n%i==0){
                    return false;
                }
            }
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        System.out.println(isPrime(n));
//            boolean isPrime = true;
//            if (n==2){
//                isPrime = true;
//        }
//            else {
//                for (int i = 2; i < Math.sqrt(n); i++){
//                    if (n%i==0){
//                        isPrime = false;
//                    }
//                }
//            }
//            if (isPrime == true){
//                System.out.println("n is prime!");
//            }else {
//                System.out.println("n is not prime!");
//            }

    }
}
