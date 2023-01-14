package Arrays;

public class LinearSearch {
    public static int LinearSearch(int arr[] , int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
            return -1;
    }
    public static int LinearSearch(String arr[] , String key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,2,6,7,8,43};
        String menu[] = {"dosa", "idly", "bada", "Bread Butter", "chole Bhature", "pav Bhaji"};
        String order = "dosa";
        int key = 2;
//        int i = LinearSearch(arr, key);
        int i = LinearSearch(menu, order);
        if (i ==-1){
            System.out.println("Not Found!");
        }
        else System.out.println("Element is at Index  " + i );
    }
}
