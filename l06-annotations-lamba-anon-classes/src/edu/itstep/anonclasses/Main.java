package edu.itstep.anonclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"David", "Joe", "Kate", "Oleg"};

//        show(strings, e -> e.toUpperCase());
        filter(strings, e -> e.length() > 3);
        System.out.println("-------------------");
        filter(strings, element -> element.toLowerCase().contains("a"));
//        Stream.empty().filter()
        System.out.println("-------------------");
        filter(strings, element -> element.toLowerCase().contains("b"));
        System.out.println("-------------------");

        Stream.of(strings)
                .map(String::toLowerCase)
                .forEach(System.out::println);
        TernaryOperator<Integer> sum = (t1, t2, t3) -> t1 + t2 + t3;
        int a = 45;

        Supplier<Void> showDate = () -> {
            System.out.println(a);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            System.out.println(sdf.format(new Date()));
            return null;
        };
//        BiFunction<>
        Predicate<Integer> cratnist = element -> element % a == 0;
    }

    public static void test(Double d){

    }

    interface TernaryOperator<T> {
        T apply(T t, T t2, T t3);
    }

    public static <T> void show(T[] elements, UnaryOperator<T> operator) {
        for (T element : elements) {
            System.out.println(operator.apply(element));
        }
    }

    public static <T> void filter(T[] elements, Predicate<T> predicate) {
        for (T element : elements) {
            if (predicate.test(element)) {
                System.out.println(element);
            }
        }
    }

    interface Predicate<T> {
        boolean test(T element);
    }


    interface UnaryOperator<T> {
        T apply(T t);
    }
}
