package javaAC_Basics1;

public class toi {
    public static void toh(int n,char src,char dest,char help) {
    if(n==1){
            System.out.println("Move disk"+n+" from "+src+" to "+dest);
        }
    else{
            toh(n-1, src, help, dest);
            System.out.println("Move disk"+n+" from "+src+" to "+dest);
            toh(n-1, help, dest, src);
        }
    }

    public static void main(String[] args) {
        toh(3,'A','C','B');
    }
}

