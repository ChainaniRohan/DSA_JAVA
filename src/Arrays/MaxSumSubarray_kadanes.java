package Arrays;

public class MaxSumSubarray_kadanes {
    public static int maxSubarray(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        if (max == 0){
            max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                max = Math.max(max,arr[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-1,-32,-4,-6};
        System.out.println(maxSubarray(arr));
    }
}
