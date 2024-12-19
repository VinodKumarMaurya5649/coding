 class Books{
    /* @params - Title,description,author,genre,year
         1. get varios book details
         2. to display book details  
    */
     String title;
     String author;
     String genre
     int year;
     float PI = 3.14f;
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
        Books  book1 = new Book("a","auth","rtyu",1999)
    }     
}        