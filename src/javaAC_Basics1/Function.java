package javaAC_Basics1;

public class Function {
    public static void main(String[] args) {
        System.out.println("sum is: "+sum(15,12));
        fun();
    }
    public static void fun(){
        System.out.println("hello world");
        return;
    }
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
