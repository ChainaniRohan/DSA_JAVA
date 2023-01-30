package Array2D;

public class findMaxMin {
    public static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int max(int arr[][]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int min(int arr[][]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        System.out.println(max(arr)+" is maximum");
        System.out.println(min(arr)+" is minumim");
    }
}
