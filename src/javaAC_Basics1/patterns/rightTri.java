package javaAC_Basics1.patterns;

public class rightTri {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++){
            for (int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
