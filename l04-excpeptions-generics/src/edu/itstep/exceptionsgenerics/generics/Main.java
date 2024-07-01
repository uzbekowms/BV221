package edu.itstep.exceptionsgenerics.generics;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // psvm
//        Object o = new Scanner(System.in);
//        Object s = new String();
//        if (o instanceof Scanner scanner) {
//            scanner.nextInt();
//        }
//        Object[] objects = {10, "asd", 3.14};
//        List elements = new ArrayList();
//        elements.add(45);
//        elements.add("45");
//        elements.add(true);
//        elements.add(new Object());

//        List<String> strings = new ArrayList<>();
//        strings.add("2");
//        AccountGeneric<String> account = new AccountGeneric<>("id", 45);
//        AccountGeneric<Integer> accountGeneric = new AccountGeneric<>(45, 45);
//        String[] strings = {"1", "2", "3"};
////        print(strings, List.of("1", "2", "3"));
//        Printer printer = new Printer();
//        printer.<String>print(strings, List.of("1"));
//        printer.<Scanner>cast(new Scanner(System.in));
//        BinaryOperator
//        List<Number> numbers = new ArrayList<Integer>();
////        sort(1, 5, 6, 7);
//        List<? extends Number> numbers = new ArrayList<Integer>();
//        numbers.add(new Integer(4));
//        List<? extends Number> doubles = new ArrayList<Double>();
////        numbers.add(new Integer(45));
//        List<? super Integer> iList = new ArrayList<Number>();
//        iList.add(23);
//        Number a = 2;
//        Cat b = new Animal();

//        iList.add(23);
//        System.out.println(iList.get(0));

//        numbers.add(5);

//        List<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//        cats.add(new Cat());
//
//        iterateAnimals(cats);
//
//        List<Pet> pets = new ArrayList<>();
//        pets.add(new Pet());
//        pets.add(new Pet());
//        pets.add(new Pet());
//        pets.add(new Pet());
//        pets.add(new Pet());
//
//        iterateAnimals(pets);
//
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//
//        iterateAnimals(dogs);
        Cat cat = new Cat(12);
        Cat cat2 = new Cat(15);
        Cat cat3 = new Cat(50);
        Cat cat4 = new Cat(10);
        Cat cat5 = new Cat(7);
//        System.out.println(max(cat, cat2));
        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        sort(cats);
        cats.forEach(System.out::println);
        List.of(1, 2, 3, 4);
    }

    //    // Upper Bounded wildcards
//    public static void iterateAnimals(Collection<? extends Animal> animals) {
//        for (Animal animal : animals)
//            System.out.println("Animal");
//
//    }
    // Pecs
    // Producer extends - T
    // Consumer super - List<? super Integer>

    // Lower Bounded wildcards
    public static void iterateAnimals(Collection<? super Cat> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal");
        }
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.set(i, src.get(i));
        }
    }

    public static <T extends Comparable<T>> T max(T element1, T element2) {
        int result = element1.compareTo(element2);
        if (result > 0) {
            return element1;
        } else {
            return element2;
        }
    }

    public static <T extends Comparable<T>> T max(T e1, T e2, T e3) {
        T max = e1;
        if (max.compareTo(e2) < 0) {
            max = e2;
        }

        return max;
    }

    public static <T extends Number> double avg(T[] e1) {
        return 12;
    }

    // Extends
    // Super
    public static <T extends Comparable<T>> void sort(List<T> elements) {
        for (int i = 0; i < elements.size() - 1; i++) {
            if (elements.get(i).compareTo(elements.get(i + 1)) > 0) {
                T temp = elements.get(i + 1);
                elements.set(i + 1, elements.get(i));
                elements.set(i, temp);
            }
        }
    }

    public static <T> void sort(List<T> elements, Comparator<? super T> comparator) {
        for (int i = 0; i < elements.size() - 1; i++) {
            if (comparator.compare(elements.get(i), elements.get(i + 1)) > 0) {
                T temp = elements.get(i + 1);
                elements.set(i + 1, elements.get(i));
                elements.set(i, temp);
            }
        }
    }

    static class Animal {
        public void feed() {
            System.out.println("Animal.feed()");
        }
    }

    static class Pet extends Animal {

        public void call() {
            System.out.println("Pet.call()");
        }
    }

    static class Cat extends Pet implements Comparable<Cat> {
        private int age;

        public Cat(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                   "age=" + age +
                   '}';
        }

        public void meow() {
            System.out.println("Cat.meow()");
        }
        // Positive number Cat(15) - Cat(12) = 15 - 12 = 3 -> First element bigger
        // Negative number  Cat(12) - Cat(15) = 12 - 15 = -3 -> Second element bigger
        // Equals number Cat(15) -  Cat(15) = 15 - 15 -> Element are equal

        @Override
        public int compareTo(Cat o) {
            return this.age - o.age;
        }
    }

    static class Dog extends Animal {
        public void bark() {
            System.out.println("Dog.bark()");
        }
    }

//    public static <T> List<T> sort(T element, T... elements) {
//        element.
//    }

    public static <T> void print(T[] items, List<T> elements) {
        for (T element : items
        ) {
            System.out.println(element);
        }
        for (T element : elements
        ) {
            System.out.println(element);
        }
    }

    public int sum(ArrayList<Integer> numbers) {
        int result = 0;

        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }
        return result;
    }

    public int sumResult(ArrayList numbers) {
        int result = 0;

        for (int i = 0; i < numbers.size(); i++) {
            result += (Integer) numbers.get(i);
        }
        return result;
    }

}

class Account {
    private Object id;
    private int sum;

    public Account(Object id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }


    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class AccountGeneric<T> {
    private T id;
    private int sum;

    public AccountGeneric(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }


    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}