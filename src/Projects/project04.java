package Projects;

public class project04 {
    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static boolean isEven(int a){
        if (a%2==0) return true;
        else return false;
    }
    public static boolean isPalandrome(int a){
        int pal = 0;
        int n = a;
        while (n!=0){
            pal = (n%10)+ (pal*10);
            n/=10;
        }
        if (a==pal) return true;
        else return false;
    }
    public static int sumD(int a){
        int lst = 0;
        while (a != 0){
            lst += a%10;
            a/=10;
        }
        return lst;
    }
    public static void main(String[] args) {
        int a = -3;
        int b = 4;
        int c = 2;
//        System.out.println(avg(a,b,c));
//        System.out.println(isEven(5));
//        System.out.println(isPalandrome(1211));
//        System.out.println(Math.abs(a));
//        System.out.println(a);
        System.out.println(sumD(-456));
    }
}
