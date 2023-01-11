package javaAC_Basics1;

//binominal coeeficient = n!/r!(n-r)!
public class binominalCoeeficeient {
    public static int bino(int n, int r){
        return fact(n)/(fact(r)*(fact(n-r)));
    }
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(bino(n,r));
    }
}
