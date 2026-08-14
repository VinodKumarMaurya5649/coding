public class arryPrint_recursion {
    public static void main(String[] args) {
        int arr[] = {5,6,8,9,7};
        print(arr,0);
    }
    public static void print(int arr[],int i) {
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        print(arr,i+1);
    }
}
