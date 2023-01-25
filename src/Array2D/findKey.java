package Array2D;

import java.util.Scanner;

public class findKey {
    public static void inp(int matrix[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void print(int matrix[][]){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.println(i+","+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        int matrix[][] = new int[m][n];
//        input
        inp(matrix);
        print(matrix);
        int key = 8;
        search(matrix, key);
    }
}
