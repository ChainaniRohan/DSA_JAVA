package BasicSorting;

public class BubbleSort {
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int swap = 0;
            for (int  j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
                if (swap == 0){
                    System.out.print(arr[i]+",");
                }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        sort(arr);
    }
}
