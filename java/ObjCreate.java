class Cat{
    String breed;
    String name;
  void cat(String name,String breed){
    this.name= name;
    this.breed =breed;
   }
   void action(){
    System.out.println("meow");
   }
}
class Dog{
    String breed;
    String name;
    void dog(String name,String breed){
    this.name= name;
    this.breed =breed;
   }
   void action(){
    System.out.println("bark");
   }
}
class Squirrel{
    String breed;
    String name;
    public void squirrel(String name,String breed) {
        this.name =name;
        this.breed =breed;
        System.out.println(name + "," +breed);
    } 
    void action(){
        System.out.println("chirp");
    }
}
class Bee{
    String breed;
    String name;
    public void squirrel(String name,String breed) {
        this.name =name;
        this.breed =breed;
        System.out.println(name + "," +breed);
    } 
    void action(){
        System.out.println("buzz");
    }
}
class Car{
    String model;
    String name;
    public void squirrel(String name,String model) {
        this.name =name;
        this.model =model;
        System.out.println(name + "," +model);
    } 
    void action(){
        System.out.println("run");
    }
}
class Boat{
    String model;
    String name;
    public void squirrel(String name,String model) {
        this.name =name;
        this.model =model;
        System.out.println(name + "," +model);
    } 
    void action(){
        System.out.println("float");
    }
}
class Airplane{
    String model;
    String name;
    public void squirrel(String name,String model) {
        this.name =name;
        this.model =model;
        System.out.println(name + "," +model);
    } 
    void action(){
        System.out.println("fly");
    }
}
class Bus{
    String model;
    String name;
    public void squirrel(String name,String model) {
        this.name =name;
        this.model =model;
        System.out.println(name + "," +model);
    } 
    void action(){
        System.out.println("public transport");
    }
}
class Bike{
    String model;
    String name;
    public void squirrel(String name,String model) {
        this.name =name;
        this.model =model;
        System.out.println(name + "," +model);
    } 
    void action(){
        System.out.println("trevel");
    }
}
class Ship{
    String model;
    String name;
    public void squirrel(String name,String model) {
        this.name =name;
        this.model =model;
        System.out.println(name + "," +model);
    } 
    void action(){
        System.out.println("import & export");
    }
}
public class ObjCreate{
    public static void main(String[] args) {
        Cat ob1 = new Cat();
        Dog ob2 = new Dog();
        Squirrel ob3 = new Squirrel();
        Bee ob4 = new Bee();
        Car ob5 = new Car();
        Boat ob6 = new Boat();
        Airplane ob7 = new Airplane();
        Bus ob8 = new Bus();
        Bike ob9 = new Bike();
        Ship ob10 = new Ship();
        ob1.action();
        ob2.action();
        ob3.action();
        ob4.action();
        ob5.action();
        ob6.action();
        ob7.action();
        ob8.action();
        ob9.action();
        ob10.action();
    }
}
