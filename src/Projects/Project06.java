package Projects;

public class Project06 {
    public static void print(int arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        int max = arr[0];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] < arr[j+1]){
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++){

        }
    }
    public static void countingSort(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int freq[] = new int[max+1];
        for (int i = 0; i <arr.length; i++){
            freq[arr[i]] += 1;
        }

            int ind = arr.length-1;
        for (int i = 0; i < freq.length; i++){
            while (freq[i] > 0){
                arr[ind] = i;
                ind--;
                freq[i]--;
            }
        }

    }

            public static void main(String[] args) {
                int arr[] = {5,31,2,41,11,3,1};
//        bubbleSort(arr);
//                selectionSort(arr);
                countingSort(arr);
                print(arr);
            }
        }