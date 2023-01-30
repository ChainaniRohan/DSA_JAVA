package Projects;

public class Project07 {
//    Print the number of 7’s that are in the 2d array
    public static int que1(int arr[][], int key){
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (key == arr[i][j]) num++;
            }
        }
        return num;
    }
//    Print out the sum of the numbers in the second row of the “nums” array
    public static int que2(int arr[][],int key){
        int sum = 0;
        if (key == 0) key = 1;
        for (int i = 0; i < arr[0].length; i++){
            sum += arr[key-1][i];
        }
        return sum;
    }
//    Write a program to Find Transposeo fa Matrix.
    public static void que3(int arr[][]){
        int transpose[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                        {4,5,6}};
        int key = 2;
//        System.out.println(que1(arr,key));
//        System.out.println(que2(arr,key));
        que3(arr);
    }
}
