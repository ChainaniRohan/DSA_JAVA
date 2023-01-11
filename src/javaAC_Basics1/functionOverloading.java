package javaAC_Basics1;

public class functionOverloading {
//        functionOverloading using parameters
//    public static int sum(int a, int b){
//        return a+b;
//    }
//    public static int sum(int a, int b,int c){
//        return a+b+c;
//    }
//        functionOverloading using Data Type
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(5.4f,3.14f));
    }
}
