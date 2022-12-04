package javaAC_Basics1;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter Radius: ");
        float radius = sc.nextFloat();
        float area = pi*radius*radius;
        System.out.println("area = "+area);
    }
}
