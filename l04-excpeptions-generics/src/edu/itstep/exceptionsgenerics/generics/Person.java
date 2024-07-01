package edu.itstep.exceptionsgenerics.generics;

public class Person implements Comparable<Person> {
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

class UnknownPerson<T> implements Comparable<T>{

    @Override
    public int compareTo(T o) {
        return 0;
    }
}