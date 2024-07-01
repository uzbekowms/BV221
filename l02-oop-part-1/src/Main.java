import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Person person = new Person();
//        Person.saySomething();

//        Worker worker = new Worker();
//        worker.work();
//        Builder builder = new Builder();
//        builder.work();
//        List<String> strings = new ArrayList<>();
//        System.out.println(new Person("asd", 2));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Гей, я можу знаходити процент з числа. Введи число:");
//        double number = scanner.nextDouble();
//        System.out.print("а тепер введи процент: ");
//        double percent = scanner.nextDouble();
//        double result = number * percent / 100;
//        System.out.println("Результат:" + result);
//        scanner.close();
    }
}

// Dictionary
// Map
// readonly
class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }


    public static void saySomething() {
        System.out.println("Hello World!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Child extends Person {
    public Child(String name, float age) {
        super(name, age);
        System.out.println("");
    }
}

class Animal {
    private String name;
}

class Dog extends Animal {

}