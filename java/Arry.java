import java.util.*;

public class Arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of element want to enter");
        int n = sc.nextInt();
        System.out.println("enter the element");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("entr two position you want to enter");
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        System.out.println("enter the element");
        int ele1 = sc.nextInt();
        int ele2 = sc.nextInt();
        int newArr[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            if (i < pos1) {
                newArr[i] = arr[i];
            } else if (i > pos1 && i < pos2) {
                newArr[i] = arr[i - 1];
            } else if (i == pos1) {
                newArr[i] = ele1;
            } else if (i == pos2) {
                newArr[i] = ele2;
            } else {
                newArr[i] = arr[i - 2];
            }
        }
        arr = new int[n + 2]; // copy the new arry in original arry
        for (int i = 0; i < n + 2; i++) {
            arr[i] = newArr[i];
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }
        sc.close();
    }
}
