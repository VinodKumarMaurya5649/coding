class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class TestPerson {
    public static void main(String[] args) {
        Person per = new Person("Alice", 30);
        System.out.println("Name: " + per.getName());
        System.out.println("Age: " + per.getAge());
    }
}