package BasicSorting;

public class CountingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++){
            int a = arr[i];
            count[a]++;
        }
            int ind = 0;
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0){
                arr[ind] = i;
                ind++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,5,3,7};
        countingSort(arr);
    }
}
