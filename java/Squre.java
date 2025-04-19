public class Squre {
    float side;
    Squre(float side){
        this.side = side;
    }
    float getArea(){
        return this.side * this.side;
    }
    public static void main(String[] args){
        Squre s1 = new Squre(5.0f);
        System.out.println(s1.getArea());
    }
}
