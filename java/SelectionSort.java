public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        for(int i=0 ; i < array.length - 1; i++) {
            int min = array[i];
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
    }
}
}