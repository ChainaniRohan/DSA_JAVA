package Arrays;

public class LargestVal {
    public static int large(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
       return largest;
    }
    public static int small(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
       return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {1,32,6,7,9,11,17};
        System.out.println(large(arr));
        System.out.println(small(arr));

    }
}
