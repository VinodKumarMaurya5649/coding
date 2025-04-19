class Triangle {
    float b;
    float h;
    Triangle(float b,float h){
        this.b = b;
        this.h = h;
    }
    float getArea(){
        return 0.5f * this.b * this.h;
    }
    float getPerimeter(){
        return this.b + this.h + (float)Math.sqrt(this.b * this.b + this.h * this.h);
    }
    public static void main(String[] args){
        Triangle t1 = new Triangle(5.0f,10.0f);
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
    }
}
