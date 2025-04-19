 public class Circle {
    float radius;
    static  float PI = 3.14f;
    Circle(float radius){
        this.radius = radius;
    }
    float getArea(){
        return PI * this.radius * this.radius;
    }
    public static void main(String[] args){
        Circle c1 = new Circle(5.0f);
        System.out.println(c1.getArea());
    }
}
class test{
    public static void main(String[] args){
        Circle c1 = new Circle(5.0f);
        System.out.println(c1.getArea());
    }
}