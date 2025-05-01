class TriangleArea{
    float b;
    float h;
    TriangleArea(float b,float h){
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
        TriangleArea t1 = new TriangleArea(5.0f,10.0f);
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
    }
}
