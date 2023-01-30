package Strings;

public class PalandromeString {
    public static boolean isPal(String str){
        int lo = 0;
        int hi = str.length()-1;
        while (lo<hi){
            if (str.charAt(lo) == str.charAt(hi)){
                lo++;
                hi--;
            }
        }
    }
}
