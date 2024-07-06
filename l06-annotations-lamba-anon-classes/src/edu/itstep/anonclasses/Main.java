package edu.itstep.anonclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.*;

public class Main {
    public static boolean simpleNumber(int number) {
        int counter = 0;
        for (int i = 2; i < number - 1; i++) {
            counter++;
            if (number % i == 0) {
                System.out.println("simpleNumber: " + counter);
                return false;
            }
        }
        System.out.println("simpleNumber: " + counter);
        return true;
    }

    public static boolean simpleNumber2(int number) {
        int counter = 0;
        for (int i = 2; i < (number / 2); i++) {
            counter++;
            if (number % i == 0) {
                System.out.println("simpleNumber2: " + counter);
                return false;
            }
        }
        System.out.println("simpleNumber2: " + counter);
        return true;
    }

    public static boolean simpleNumber3(int number) {
        int counter = 0;
        for (int i = 2; i < Math.ceil(Math.sqrt(number)); i++) {
            counter++;
            if (number % i == 0) {
                System.out.println("simpleNumber3: " + counter);
                return false;
            }
        }
        System.out.println("simpleNumber3: " + counter);
        return true;
    }


    public static void main(String[] args) {
        System.out.println("FIRST------------");
        System.out.println(simpleNumber(7));
        System.out.println(simpleNumber(96));
        System.out.println(simpleNumber(97));
        System.out.println("SECOND------------");
        System.out.println(simpleNumber2(7));
        System.out.println(simpleNumber2(96));
        System.out.println(simpleNumber2(97));
        System.out.println("THIRD------------");
        System.out.println(simpleNumber3(7));
        System.out.println(simpleNumber3(96));
        System.out.println(simpleNumber3(97));


//        int a = 10;
//        System.out.println(70 / Math.sqrt(70));
//
////        for (int i = 0; i < Math.ceil(Math.sqrt(a)); i++) {
////            if ()
////        }
//
//
//        String[] strings = {"David", "Joe", "Kate", "Oleg"};
//
////        show(strings, e -> e.toUpperCase());
//        filter(strings, e -> e.length() > 3);
//        System.out.println("-------------------");
//        filter(strings, element -> element.toLowerCase().contains("a"));
////        Stream.empty().filter()
//        System.out.println("-------------------");
//        filter(strings, element -> element.toLowerCase().contains("b"));
//        System.out.println("-------------------");
//
//        Stream.of(strings)
//                .map(String::toLowerCase)
//                .forEach(System.out::println);
//        TernaryOperator<Integer> sum = (t1, t2, t3) -> t1 + t2 + t3;
////        int a = 45;
//
//        Supplier<Void> showDate = () -> {
//            System.out.println(a);
//            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//            System.out.println(sdf.format(new Date()));
//            return null;
//        };
////        BiFunction<>
//        Predicate<Integer> cratnist = element -> element % a == 0;
//        sum(List.of(1, 2, 3), (e) -> e % 2 == 0);
//
//        int startRange = 1;
//        int endRange = 1;
//
//        sum(List.of(1, 2, 3), (e) -> e > startRange && e < endRange);
//
//        int b = 2;
//
//        System.out.println(sum(List.of(1, 2, 3), (e) -> e % b == 0));
    }

    public static int sum(List<Integer> numbers, Predicate<Integer> predicate) {
        int sum = 0;


        return 0;
    }

    public static void test(Double d) {

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
//
//    interface Predicate<T> {
//        boolean test(T element);
//    }


    interface UnaryOperator<T> {
        T apply(T t);
    }
}
