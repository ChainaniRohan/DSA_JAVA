package javaAC_Basics1;

public class typeConversion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);

        byte c = 25;
        int d = 233;
        float e = 34.54f;
        long f = 32;
        double g = 322;
        long h = (long) (c+d+e+f+g);
        System.out.println(c+d+f+g);
        System.out.println(h);
    }
}
