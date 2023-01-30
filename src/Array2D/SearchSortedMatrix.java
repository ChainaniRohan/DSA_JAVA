package Array2D;

public class SearchSortedMatrix {
    public static boolean staircaseSearch(int arr[][], int key){
//        1st approch
//        int row = 0;
//        int col = arr[0].length-1;
//        while (row < arr.length && col >= 0){
//            if (arr[row][col] == key){
//                System.out.println("key found at: "+row+","+col);
//                return true;
//            }
//            else if (arr[row][col] > key) col--;
//            else row++;
//        }
//        System.out.println("key not found");
//        return false;

//        2nd approch
        int row = arr.length-1;
        int col = 0;
        while (row >= 0 && col < arr[0].length){
            if (arr[row][col] == key){
                System.out.println("found at : "+row+","+col);
                return true;
            }
            else if (arr[row][col] > key) row--;
            else col++;
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key = 14;
        staircaseSearch(arr, key);
    }
}
