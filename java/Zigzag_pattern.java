// input-1
// o/p = 111
// i/p = 2
// o/p = 211121112
// i/p = 3
// o/p = 321112111232111211123
import java.util.Scanner;
public class Zigzag_pattern{
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    zig(n);
    sc.close();
 }
 public static void zig(int n){
    if(n==0) return;
    System.out.print(n+" ");
    zig(n-1);
    System.out.print(n+" ");
    zig(n-1);
    System.out.println(n+" ");
 }
}
