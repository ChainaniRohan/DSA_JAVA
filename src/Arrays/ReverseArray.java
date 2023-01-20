package Arrays;

public class ReverseArray {
    public static void reverse(int arr[]){
        int low = 0;
        int hi = arr.length-1;
        while (low < hi){
             int temp =  arr[hi];
             arr[hi] = arr[low];
             arr[low] = temp;
             low++;
             hi--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,81};
        reverse(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
