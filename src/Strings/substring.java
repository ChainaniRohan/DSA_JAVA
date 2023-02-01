package Strings;

public class substring {
    public static String sub(String str, int lo, int hi){
        String st = "";
        for (int i = lo; i < hi; i++){
            st += str.charAt(i);
        }
        return st;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(sub(str,0,5));
//        sub string function

    }
}
