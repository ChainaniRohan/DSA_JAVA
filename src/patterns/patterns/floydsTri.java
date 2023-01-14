package patterns.patterns;

public class floydsTri {
    public static void main(String[] args) {
        int a = 1;
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }
    }
}
