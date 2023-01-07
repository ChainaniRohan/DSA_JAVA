package javaAC_Basics1.patterns;

public class diamond {
    public static void main(String[] args) {
        int n = 7;
        int a = 4;
        int x = 1;
        for (int i =1; i <= a; i++){
//            for (int j = 1; j <= (a-i+1);j++){
//                System.out.print(" ");
//            }
            for (int j = 1; j <= n; j++){
               System.out.print("*");
               x+=2;
               }
            System.out.println("");
        }
    }
}
