public class findUniqueWay {
   static int count =0;
    public static void main(String[] args) {
       int  m = 3;
       int n = 3;   
        Ways(m-1,n-1,0,0,"");
        System.out.println(count);
        
    }
    public static void Ways(int m,int n,int cr,int ec, String path){
        if(cr>m || ec>n){
            return;
        }
        if(cr==m&& ec==n){
            count++;
            System.out.println(path);
            return;
        }
        Ways(m,n,cr,ec+1,path+"h");
        Ways(m,n,cr+1,ec,path+"v");
    }
}