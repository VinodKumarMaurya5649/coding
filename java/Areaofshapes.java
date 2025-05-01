public class Areaofshapes {
    
    public static void main(String[] args) {
         Rectangle rec1= new Rectangle(2,3);
         Rectangle rec2= new Rectangle(4,5);
         Rectangle rec3= new Rectangle(6,7);
         Rectangle rec4= new Rectangle(8,9);
         Rectangle rec5= new Rectangle(10,20);
         Square  sq1= new Square(2);
         Square  sq2= new Square(3);
         Square  sq3= new Square(4);
         Square  sq4= new Square(5);
         Square  sq5= new Square(6);
         Circle c1 = new Circle(2);
         Circle c2 = new Circle(3);
         Circle c3 = new Circle(4);
         Circle c4 = new Circle(5);
         Circle c5 = new Circle(6);
         rec1.display();
         rec2.display();
         rec3.display();
         rec4.display();
         rec5.display();
         sq1.display();
         sq2.display();
         sq3.display();
         sq4.display();
         sq5.display();
         c1.display();
         c2.display();
         c3.display();
         c4.display();
         c5.display();
         for (int i = 1; i < 6; i++) {
            Triangle tr =new Triangle(i,i+2,i+5);
            tr.display();
         }
    }
}
class Rectangle{
    float a;
    float b;
    Rectangle(float a,float b){
         this.a=a ;
         this.b=b;
    }
      
        float Area(){
          return this.a*this.b;
    }
        float Perimeter(){
          return 2*(this.a+b);
    }
    void display(){
        System.out.println("Side: "+ this.a+", "+this.b+" area: "+this.Area()+",Perimeter: "+this.Perimeter());

    }

}
class Square{
     float side;
     Square(float side){
        this.side =side;
     }
     float Area(){
       return this.side*this.side;
 }
     float Perimeter(){
       return 4*this.side;
 }
 void display(){
     System.out.println("Side: "+ this.side+" area: "+this.Area()+",Perimeter: "+this.Perimeter());

 }

}
class Circle{
    static float PI = 3.14f;
    float redius;
    Circle(float redius){
        this.redius=redius;
    }
    float Area(){
      return this.redius*this.redius*PI;
}
    float Perimeter(){
      return 2*PI*this.redius;
}
void display(){
    System.out.println("redius: "+ this.redius+"area: "+this.Area()+",Perimeter: "+this.Perimeter());

}
}
class Triangle{
    float side1;
    float side2;
    float side3;
    Triangle(float side1,float side2,float Side3){
        this.side1 =side1;
        this.side1 =side1;
        this.side1 =side1;
    }
    float Perimeter(){
        return this.side1+this.side2+this.side3;
    }
    float Area(){
    float s = this.Perimeter()/2;
    return (s*(s-side1)*(s-side2)*(s-side3))*0.5f;
    }
   void display(){
        System.out.println("sides: "+this.side1+" ,"+this.side2+" ,"+this.side3+" ,"+"area: "+this.Area()+",Perimeter: "+this.Perimeter() );
    }
}




