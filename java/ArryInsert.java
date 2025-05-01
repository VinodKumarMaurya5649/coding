import java.util.*;
public class ArryInsert{
 	public static void main(String arg[]){
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter n");
                 int n= sc.nextInt();
    		int[] arr = new int[n];
		System.out.println("enter element");
		for(int i= 0;i<n;i++){
			arr[i] = sc.nextInt();
		}		
        System.out.println("enter position ");
			int pos1 = sc.nextInt()-1;
	   System.out.println("enter element");
			int ele1 = sc.nextInt();
		// int[]newarr =new int[n+1];
		// for(int i=0;i<pos1;i++){
		// 	newarr[i] = arr[i];
		// }
		//  newarr[pos1] = ele1;
		//  for (int i = pos1; i < n; i++) {
        //     newarr[i + 1] = arr[i];
        // }
		Array b =new Array();
	  for(int i= 0;i<arr.length;i++){
			System.out.println((b.insert(pos1,ele1, arr)));
		}
		sc.close();
}
}
class Array{
	int [] insert(int pos,int input,int [] arr){
		int n = arr.length;
		int[]newarr =new int[n+1];
		for(int i=0;i<pos;i++){
			newarr[i] = arr[i];
		}
		 newarr[pos] = input;
		 for (int i = pos; i < n; i++) {
            newarr[i + 1] = arr[i];
        }
		return newarr;
	}
}