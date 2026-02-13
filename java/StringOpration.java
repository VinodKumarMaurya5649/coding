public class StringOpration {
    public static <T> void print(T i){
    System.out.print(i);
}
    public static void main(String[] args) {
        // String a  = "hell0";
    //     String b  = "hell0";
    //    System.out.println(a.equals(b));
    //    char [] ar = a.toCharArray();
    //    print(new String(ar));
    //    for (int i = 0; i < 128; i++) {
    //      print(i+"-->"+(char)i);
    //    }
    //    print(a.charAt(2));
    String x = "aBcD";
    // char [] arr= new char[x.length()];
    // for (int i = 0; i < x.length(); i++) {
    //     char c = x.charAt(i);
    //     if(c>='a' && c<='z'){
    //         arr[i] = (char)(c-32);
    //     }
    //     else if(c>='A' && c<='Z'){
    //         arr[i] = (char)(c+32);
    //     }
    // }
    // print((new String(arr)));
   
    for(int i=0;i<x.length();i++){
       for(int j=i;j<=x.length();j++){
          System.out.println(x.substring(i, j)); 
       }
        
    }
}

}