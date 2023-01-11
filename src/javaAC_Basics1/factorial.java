package javaAC_Basics1;

public class factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static int facto(int n){
        int f = 1;
        for (int i = 1; i<=n;i++){
            f = f*i;
           }
            return f;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fact(n));
        System.out.println(facto(n));
    }
}
