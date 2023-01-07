package javaAC_Basics1.patterns;

public class hollowRectangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            if (i==1||i==4){
                for (int j = 1; j<=i+1; j++){
                    System.out.print("*");
                }
            }
        }
    }
}
