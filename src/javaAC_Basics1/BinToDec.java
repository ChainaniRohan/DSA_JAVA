package javaAC_Basics1;

import java.util.Scanner;

public class BinToDec {
    public static int decimal(int n){
        int Dec = 0;
        int pow = 0;
        while (n > 0){
            int lastd = n%10;
            Dec = Dec + (lastd * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        return Dec;
    }
    public static int binary(int n){
        int bin = 0;
        int pow = 0;
        while (n>0){
            bin = bin + (n%2)*(int)(Math.pow(10,pow));
            n/=2;
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
    }
}
