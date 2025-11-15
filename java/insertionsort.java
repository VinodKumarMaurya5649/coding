public class insertionsort {
    public static void insertionSort(int arr[]){

       
        for (int i = 1; i < arr.length; i++) {
            int f = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > f) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = f;
        }
    }
    public static void main(String[] args) {
         int arr[] = {12, 11, 13, 5, 6};
        insertionSort(arr);
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
