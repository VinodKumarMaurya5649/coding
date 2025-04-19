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
        public static void main(String[] args) {
            Username ob1 = new Username();
            ob1.display();
            ob1.address();
            ob1.show();
        }
} 