package Arrays;

public class MaxSumSubarray_PrefixSum {
    public static int maxSum(int arr[]){
        int max = 0;
        int sum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,-6,8};
        System.out.println(maxSum(arr));
    }
}
