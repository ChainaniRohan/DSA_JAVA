package Projects;

public class project05 {
//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
    public static boolean ifDistinct(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
//    Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums
    public static int search(int arr[],int target,int f,int l) {
        int mid = (f + l) / 2;
        if(f>l){
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] <= arr[l]) {
            if (arr[mid] <= target && arr[l] >= target) {
                return search(arr, target, mid + 1, l);
            }
            else return search(arr, target, f, mid - 1);
        } else {
            if(arr[mid] >= target && arr[f] <= target)
                return search(arr, target, f, mid - 1);
                else return search(arr, target, mid + 1, l);
        }
    }

//    You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

    public static int Max(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++){
            if (buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

//    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

    public static int trap(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] =arr[0];
        right[arr.length-1] =arr[arr.length-1];
        for (int i = 1; i< arr.length; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for (int i = arr.length-2; i >= 0; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int trapped = 0;
        for (int i = 0; i<arr.length; i++){
                int waterlevel = Math.min(left[i],right[i]);
                trapped += waterlevel-arr[i];
        }
        return trapped;
    }

//    Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and
//    nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets

    public static void triplet(int arr[]){
                    if (arr.length == 0||arr.length == 1){
                        System.out.print("[]");
                    }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                for (int k = 0; k < j; k++){
                    if ((i != j && i != k && j!= k)&&((arr[i]+arr[j]+arr[k])==0)){
                        System.out.print("[");
                        System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                        System.out.print(",");
                        System.out.print("]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {15,16,1,3,4,5,6,7};
        int f = 0, l = arr.length-1;
        int target = 116;
        System.out.println(search(arr,target,f,l));
//        System.out.println(trap(arr));
//        triplet(arr);
//        System.out.println(Max(arr));
//        System.out.println(ifDistinc  t(arr));
    }
}
