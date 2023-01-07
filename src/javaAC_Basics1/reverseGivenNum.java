package javaAC_Basics1;

import java.util.Scanner;

public class reverseGivenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        reverse the given number
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
