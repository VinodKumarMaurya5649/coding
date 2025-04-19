class InheritanceLearn{
    void address(){
        String add ="BKT,LKO";
        System.out.println("address:-"+add);
    }
    void show(){
     System.out.println("this is Show Function");
    }
}
class Username extends InheritanceLearn{
        void display()
        {
            System.out.println("my name is <username>");
        }
}
class Base2 extends Username{
    int a=10;
    void count(){
    System.out.println(a++);
    }
    public static void main(String[] args) {
        Base2 ob1 = new Base2();
        ob1.display();
        ob1.address();
        ob1.show();
        ob1.count();
    }
}