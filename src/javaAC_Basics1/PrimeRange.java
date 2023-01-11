package javaAC_Basics1;

import org.w3c.dom.ranges.Range;

import java.util.Random;
import java.util.Scanner;

public class PrimeRange {
    public static boolean isprime(int n){
        if (n <2){
            return false;
        }
        if (n==2){
            return true;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void Range(int n){
        for (int i = 2; i <= n; i++){
            if (isprime(i)==true){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Range(n);
//        System.out.println(Range);
    }
}
