 class Books{
    /* @params - Title,description,author,genre,year
         1. get varios book details
         2. to display book details  
    */
   Book(String title,String author,String genre,int year){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = genre;
   }
   String getDetails(){
        return "title" + this.title;
   }
        
    
 }

 public class LMS {
    public static void main(String[] args){
        Books new Books("a","auth","rtyu",1999)
    }
 }