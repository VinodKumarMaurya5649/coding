public class powerRecurision {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int ans = pow(a,b);
        System.out.println(ans);
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        return a*pow(a, b-1);
    }
}
