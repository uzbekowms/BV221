package edu.itstep.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Stream API
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

//        for (String str : list) {
//            System.out.println(str);
//        }
//        List<String> startsWithF = list.stream()
//                .filter(s -> s.startsWith("f"))
//                .toList();
//
//        startsWithF.forEach(System.out::println);
//        Map<String, String> map = new HashMap<>();
//        Stream.empty();
//        list.stream();
//        map.entrySet().stream();
//        Arrays.stream();
//        Stream.of("one", "two", "three", "four", "five");
//
        int[] arr = {140, 230, 564, 8, 79, 63, 1654, 8, 964, 16, 64, 8};
//        int count = 0;
//        for (int x : arr) {
//            if (x <= 300) continue;
//            x += 11;
//            count++;
//            if (count > 3) break;
//            System.out.println(x);
//        }

//        Arrays.stream(arr)
//                .filter(x -> x >= 300) // фільтрація елементів по заданій перевірці
//                .map(x -> x + 11) // додає 11 до числа
//                .limit(3) // обмежує кількість елементів
//                .forEach(System.out::println);

//        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);
//        stream.filter(s -> s.startsWith("f"));
//        stream.forEach(System.out::println);


//
//        for (int x : arr){
//            System.out.println(x);

//        list.parallelStream().forEach(System.out::println);

//        List<Integer> ints = new ArrayList<>();
//        IntStream.range(0, 1_000_000)
//                .parallel()
//                .forEach(i -> ints.add(i));
//        System.out.println(ints.size());

//        Stream<T>
//        IntStream
//        LongStream
//        DoubleStream
//        Stream.empty();
//        Stream.of();
//        Stream.ofNullable();
//        Stream.generate()
//
//        IntStream.range(0,10)
//                .forEach(System.out::println);

//        Stream.generate(() -> 6)
//                .limit(5)
//                .forEach(System.out::println);

//        Stream.iterate(2, x -> x + 4)
//                .limit(5)
//                .forEach(System.out::println);

//        Stream.iterate(2, x -> x < 25, x -> x + 10)
//                .forEach(System.out::println);

//        Stream.concat(
//                Stream.of(1, 2, 3),
//                Stream.of(4, 5, 6)
//        ).forEach(System.out::println);
//        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
//                .add(1)
//                .add(2);
//
//        streamBuilder.accept(2);
//
//
//        streamBuilder.add(5)
//                .build()
//                .forEach(System.out::println);
//
//        IntStream.range(0,10)
//                .forEach(System.out::println);
//
//        LongStream.range(-10, 10)
//                .forEach(System.out::println);
//
//        IntStream.rangeClosed(0, 10)
//                .forEach(System.out::println);
//
//        Stream.of(1,2,3)
//                .filter(x -> x % 2 == 0)
//                .forEach(System.out::println);

//        Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9")
//                .map(Integer::parseInt)
//                .forEach(System.out::println);

//        Stream.of(2, 3, 0, 4, 1, 3)
//                .flatMapToInt(x -> IntStream.range(0, x))
//                .forEach(System.out::println);
//
//        Stream.of("Hello", "world")
//                .flatMap(str -> Arrays.stream(str.split("")))
//                .forEach(System.out::println);
//        List<List<Integer>> lists = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5, 6),
//                List.of(7, 8, 9)
//        );
//        lists.forEach(System.out::println);
//
//        lists.stream()
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .flatMap(x -> {
//                    if (x % 2 == 0) {
//                        return Stream.of(-x, x);
//                    }
//                    return Stream.empty();
//                })
//                .forEach(System.out::println);
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .mapMulti((x, consumer) -> {
//                    if (x % 2 == 0) {
//                        consumer.accept(-x);
//                        consumer.accept(x);
//                    }
//                })
//                .forEach(System.out::println);
//
//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                .limit(4)
//                .forEach(System.out::println);

//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                .skip(4)
//                .forEach(System.out::println);
//
//        IntStream.range(0, 10)
//                .limit(5) // 0 1 2 3 4
//                .skip(3) // 3 4
//                .forEach(System.out::println);

//        IntStream.range(0, 10) // 0 1 2 3 4 5 6 7 8 9
//                .skip(5) // 5 6 7 8 9
//                .limit(3) // 5 6 7
//                .skip(1) // 6 7
//                .forEach(System.out::println);

//            IntStream.range(0,100)
//                    .sorted()
//                    .limit(3)
//                    .forEach(System.out::println);
//        Stream.of(654, 416, 4, 64, 1, 3, 84, 6)
//                .sorted()
//                .forEach(System.out::println);
//
//        Stream.of(1,1,2,3,4,4,4,5,5,5,5,5,5)
//                .distinct()
//                .forEach(System.out::println);
//        Stream.of(0, 3, 0, 4, 5, 0, 4, 0, 0)
//                .peek(x -> System.out.println("Before distinct - " + x))
//                .distinct()
//                .peek(x -> System.out.println("After distinct - " + x))
//                .map(x -> x * x)
//                .forEach(System.out::println);
//        Stream.of(1, 2, 1, 4, 5, 3, 41, 6, 4)
//                .takeWhile(x -> x < 5)
//                .forEach(System.out::println);
//
//        Stream.of(1, 2, 1, 4, 5, 3, 41, 6, 4)
//                .dropWhile(x -> x < 5)
//                .forEach(System.out::println);
//
//        DoubleStream.of(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9)
//                .boxed()
//                .map(Object::getClass)
//                .forEach(System.out::println);
//        IntStream.range(0,100)
//                .parallel()
//                .forEach(System.out::println);
//
//        IntStream.range(0,100)
//                .parallel()
//                .forEachOrdered(System.out::println);
//        long result = Stream.of(1,2,3,4,5)
//                .filter(x -> x % 2 == 0)
//                .count();
//
//        System.out.println(result);
//        ArrayList<String> collect = Stream.of("a", "b", "c", "d", "e", "f", "g", "h")
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        System.out.println(collect);
//        Stream.of()
//                .min().
//        Stream.of()
//                .toL
        // (1, 2, 3, 4, 5) (((((1) + 2) + 3) + 4) + 5)
//        int anySeq = IntStream.range(4, 10_000)
//                .findAny()
//                .getAsInt();
//
//        System.out.println(anySeq);
//
//        int anyPar = IntStream.range(4, 10_000)
//                .parallel()
//                .findAny()
//                .getAsInt();
//
//        System.out.println(anyPar);
//
//        int firstSeq = IntStream.range(4, 10_000)
//                .findFirst()
//                .getAsInt();
//
//        System.out.println(firstSeq);
//
//        int firstPar = IntStream.range(4, 10_000)
//                .parallel()
//                .findFirst()
//                .getAsInt();
//
//        System.out.println(firstPar);
//
//        boolean result = Stream.of(1, 2, 3, 4, 5, 6)
//                .anyMatch(x -> x == 3);
//
//        System.out.println(result);
//
//        result = Stream.of(1, 2, 3, 4, 5, 6)
//                .anyMatch(x -> x == 8);
//
//        System.out.println(result);
//        LongSummaryStatistics longSummaryStatistics = LongStream.range(2, 16)
//                .summaryStatistics();
//
//        System.out.println(longSummaryStatistics);
//        System.out.println(Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.toMap(Function.identity(), Function.identity())));

//        System.out.println(Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.toMap(
//                                Function.identity(),
//                                i -> String.format("%d * 2 = %d", i, i * 2)
//                        )
//                ));
//
//        long count = IntStream.generate(() -> new Random().nextInt(1, 10))
//                .peek(System.out::println)
//                .limit(10)
//                .filter(x -> x % 2 == 0)
//                .count();
//        System.out.println(count);
        List<Person> personList = List.of(new Person("Oleg", 42),
                new Person("Misha", 15),
                new Person("Ann", 50),
                new Person("Vitliy", 9));

        personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(System.out::println);
    }

    static class Person {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}