public class Main{
    static class Dog{
        String name;
        String breed;
        Dog(String name,String breed){
            this.name =name;
            this.breed =breed;
        }
    }
    static class Cat{
        String name;
        String color;
        Cat(String name,String color){
            this.name =name;
            this.color =color;
        }
    }
    static class Car{
        String name;
        String model;
        Car(String name,String model){
            this.name =name;
            this.model =model;
        }
    }
    static class Employee{
        String name;
        String rank;
        Employee(String name,String rank){
            this.name = name;
            this.rank = rank;

        }
    }
    static class Book{
        String title;
        String author;
        Book(String title,String author){
            this.title=title;
            this.author=author;
        }
    }
    static class Laptop{
        String name;
        String model;
        Laptop(String name,String model){
            this.name =name;
            this.model =model;
        }
}
    static class City{
    String name;
    int population;
    City(String name, int population) {
        this.name = name;
        this.population = population;
    }
}
public static void main(String[] args) {
    Object[] arrayofObjects = {
        new Dog[] { new Dog("Tom","Golden Retriever")},
        new Cat[] { new Cat("pummy","red")},
        new Car[] { new Car("toyeta","camery")},
        new Employee[] { new Employee("vishal","senior")},
        new Book[] { new Book("pachtantra", "vishunu kumar gupt")},
        new Laptop[] { new Laptop("lenovo","ideapads145")},
        new City[] { new City("balrampur",23000000)}
    };
    System.out.println("Created an arrys 0f 10 diffrent class");
    for(int i = 0;i<arrayofObjects.length;i++){
        System.out.println(arrayofObjects[i]);
    }
}
}