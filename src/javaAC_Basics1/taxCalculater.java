package javaAC_Basics1;

import java.util.Scanner;

public class taxCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000){
            System.out.println("No Tax Required");
        }
        else if(income >500000 && income < 1000001){
            System.out.println((income/100)*15);
        }
        else {
            System.out.println((income/100)*25);
        }
    }
}
