public class Test {
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,6,3,5,4,3,1,2};
        int c=0; int f=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
             if (arr[i] == arr[j]) {
                    c++;
                   
                }
             if(c>f){
                 f=c;
                 c=0;
             }
            }
        }
        System.out.println(f);
    }
}