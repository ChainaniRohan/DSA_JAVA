package Arrays;

public class subarrayInArray {
    public static void subarray(int arr[]){
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
//                    int add = 0;
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                    total++;
//                    add += arr[k];
                }
//                System.out.print("= "+add);
                System.out.print(" , ");
            }
            System.out.println();
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-3,4};
        subarray(arr);
    }
}
