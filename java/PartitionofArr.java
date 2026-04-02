public class PartitionofArr {
    public static void main(String[] args) {
        int arr[] = { 2, 33, 45, 2, 78, 12, 10 };
        System.out.println(partation(arr, 0, arr.length - 1));
    }

    private static int partation(int[] arr, int si, int ei) {
        int ele = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < ele) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
           
        }
         int temp = arr[ei];
            arr[ei] = arr[idx];
            arr[idx] = temp;
            return idx;
    }

}
