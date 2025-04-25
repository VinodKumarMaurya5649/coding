import java.util.*;
public class Trail{
	public static void main(String args[]){
	 System.out.println("enter the no. of element");
	 Scanner sc= new Scanner(System.in);
	 int n = sc.nextInt();
     int[] x = new int[n];
	  for(int i =0; i<n;++i){
		 x[i] = sc.nextInt();
	  }
	 int max_element = x[0];
	 for (int i =1; i<n;++i){
		if(x[i]>max_element){
			max_element = x[i];
		}
	 }
	 System.out.println(max_element);
	 sc.close();
	} 
}
/*
 * arrys of 
 * arry of n integers
 * function retururning...
 * int main() --- main is a function returning int
 * methods
 * method of 
 * address:
 * pointer to 
 * refrence to
 *fun() function calling /method invoking
 function call - create temp copy of function
 */