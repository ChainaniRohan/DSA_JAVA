package Arrays;

public class trappedRainWater {
    public static int trapped(int arr[]){
    int leftMax[] = new int[arr.length];
    leftMax[0] = arr[0];
    for (int i = 1; i < arr.length; i++){
        leftMax[i] = Math.max(leftMax[i-1],arr[i]);
    }
    int RightMax[] = new int[arr.length];
    RightMax[arr.length-1] = arr[arr.length-1];
    for (int i = arr.length-2; i >= 0; i--){
        RightMax[i] = Math.max(RightMax[i+1],arr[i]);
    }
    int trappedWater = 0;
    for (int i = 0; i < arr.length; i++){
        int waterLevel = Math.min(leftMax[i],RightMax[i]);

        trappedWater += waterLevel - arr[i];
    }
    return trappedWater;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 5, 2, 4, 6, 0, 8};
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trapped(arr));
    }
}
