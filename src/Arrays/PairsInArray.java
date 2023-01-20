package Arrays;

public class PairsInArray {
    public static void pair(int arr[]){
            int total = 0;
        for (int i = 0; i<arr.length; i++){
            int current = arr[i];
            for (int j = i+1; j < arr.length; j++){
                System.out.print("("+current+" , "+arr[j]+") ");
                total++;
            }
            System.out.println();
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,21,6,32,7,65,71};
        pair(arr);
    }
}
