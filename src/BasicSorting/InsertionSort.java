package BasicSorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int cur = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev]>cur){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = cur;
        }
    }
    public static void print(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        insertionSort(arr);
        print(arr);

    }
}
