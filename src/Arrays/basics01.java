package Arrays;

import java.util.Scanner;

public class basics01 {
    public static void minorMarks(int marks[]){
        marks[2] = 54;
        marks[0] = 123;
        marks[3] = 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        minorMarks(marks);
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
