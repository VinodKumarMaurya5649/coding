import java.util.*;

public class ListOddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element");
        int n = sc.nextInt();
        System.out.println("enter the element");
        int[] a = new int[n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd) {
            System.out.println("0");
        } else {
            for (int i = 0; i < n; i++) {
                a[i] = -1;
                System.out.print(a[i]);
            }

        }
        sc.close();
    }
}
