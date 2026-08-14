public class Stairclimb {
 public static void main(String[] args) {
    int n = 4;
    Dice(n,0,"");
 }   
 public static void  Dice(int n,int cur,String path){
   if(cur==n){
    System.out.println(path);
    return;
   }
   if(cur>n){
    return;
   }
   for (int i = 1; i <3; i++) {
        Dice(n, cur+i, path+i);
   }
 }
}