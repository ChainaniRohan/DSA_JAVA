package javaAC_Basics1;

public class basic01 {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        System.out.println("Hello Rohan!");
        // basic pattern printing!
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        // swap
        int a = 1;
        int b = 4;
        System.out.println(a+" "+b);
        swap(a,b);
    }
}
