package Arrays;

public class BinarySearch {
    public static int search(int arr[], int first, int last, int key) {
//        aproch 1
//        int mid = (first+last)/2;
//        if (first > last){
//            System.out.println("not found");
//            return;
//        }
//        if (arr[mid] == key){
//            System.out.println(mid);
//            return;
//        }
//        else if (arr[mid] > key){
//            search(arr, first, mid-1, key);
//        }
//        else search(arr,mid+1, last, key);
//    }

//        aproch 2
//        while (first <= last){
//            int mid = (first+last)/2;
//            if (arr[mid] == key){
//                return mid;
//            }
//            else if (arr[mid]>key){
//                last = mid-1;
//            }
//            else {
//                first = mid+1;
//            }
//        }return -1;

//        approch 3
        while (first <= last){
            int mid = first+(last-first)/2;
            if (arr[mid]==key){
//                System.out.println(mid);
                return mid;
            }
            else if (arr[mid] > key){
                return search(arr, first, mid-1, key);
            }
            else return search(arr, mid+1, last,key);
        }
//        System.out.println("not found!");
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,7,8,9,13,18};
        int key = 2;
        int first = 0;
        int last = arr.length-1;
        System.out.println(search(arr, first, last, key));
//        if (i == -1){
//            System.out.println("Not Found");
//        }
//        else System.out.println("found at "+ i);
    }
}
