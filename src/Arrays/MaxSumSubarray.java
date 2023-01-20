package Arrays;

public class MaxSumSubarray {
    public static void MaxSumsubarray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int sum = 0;
                for (int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-3,4,-1,6};
        MaxSumsubarray(arr);
    }
}
