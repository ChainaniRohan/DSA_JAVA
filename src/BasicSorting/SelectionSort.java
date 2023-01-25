package BasicSorting;

public class SelectionSort {
    public static void selection(int arr[]){
//        for (int i = 1; i< arr.length; i++){
//            if (min < arr[i]){
//                min = arr[i];
//            }
//            int temp = arr[point];
//            arr[point] = arr[i];
//            arr[i] = temp;
//            point++;
//        }
    }
    public static void select(int arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0};
        select(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
