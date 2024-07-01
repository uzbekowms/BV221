package edu.itstep.exceptionsgenerics.generics;

import java.util.List;

public class Printer {
    public <T> void print(T[] items, List<T> elements) {
        for (T element : items
        ) {
            System.out.println(element);
        }
        for (T element : elements
        ) {
            System.out.println(element);
        }
    }

    public <T> T cast(Object o) {
        return (T) o;
    }
}
