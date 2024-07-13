# Stream API

```java
Stream.empty();
Stream.of();
Stream.ofNullable();
Stream.generate()
```

## Comparator<T>
Потрібен для порівняння двух елементів
Повертає позитивне (+) число, якщо перший елемент більше
Повертає негативне (-) число, якщо другий елемент більше
Повертає 0, якщо значення рівні
120 - 80 = 40 - перший елемент більше
80 - 120 = -40 - другий елемент більше

## Supplier<T>
Потрібен для реалізації метода get, та зазвичай використовується для передачі інформації або для генерації елементів

```java
Stream.generate(() -> 6)
        .limit(5)
        .forEach(System.out::println);
```

## Predicate<T>
Потрібен для вказання перевірок
```java
Arrays.stream(arr)
        .filter(x -> x >= 300) // фільтрація елементів по заданій перевірці
        .map(x -> x + 11) // додає 11 до числа
        .limit(3) // обмежує кількість елементів
        .forEach(System.out::println);
```

## UnaryOperator<T>
Потрібен для операції над одним елементом
# BinaryOperator<T>
Потрібен для операції над двома елементами

## Iterate
```java
Stream.iterate(2, x -> x + 4)
        .limit(5)
        .forEach(System.out::println);
```

```java
Stream.iterate(2, x -> x < 25, x -> x + 10)
                .forEach(System.out::println);
```

## Concat
Поєднання двух стрімів
```java
Stream.concat(
        Stream.of(1, 2, 3),
        Stream.of(4, 5, 6)
).forEach(System.out::println);
```

## Stream.builder()

```java
Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
        .add(1)
        .add(2);

streamBuilder.accept(2);


streamBuilder.add(5)
        .build()
        .forEach(System.out::println);
```

# Primitive Streams
- IntStream
- LongStream
- DoubleStream

##  .range(startInclusive, endExclusive)

```java
IntStream.range(0,10)
        .forEach(System.out::println);
```

```java
LongStream.range(-10, 10)
        .forEach(System.out::println);
```

## .rangeClosed(startInclusive, endInclusive)
```java
IntStream.rangeClosed(0, 10)
        .forEach(System.out::println);
```

# Intermediate operators
- filter(Predicate<T> predicate) -
Виконує перевірку елемента
```java
Stream.of(1,2,3)
        .filter(x -> x % 2 == 0)
        .forEach(System.out::println);
```
- map(Function mapper) - Застосовує функцію до кожного елемента і потім повертає стрім в якому елементи будуть результатами функцію
```java
Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9")
        .map(Integer::parseInt)
        .forEach(System.out::println);
```
- flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) - потрібен для перетворення елемента на стрім. Цей стрім може бути або порожнім, або з 1 елементом, або з багатьма елементами
```java
Stream.of(2, 3, 0, 4, 1, 3)
        .flatMapToInt(x -> IntStream.range(0, x))
        .forEach(System.out::println);

Stream.of("Hello", "world")
        .flatMap(str -> Arrays.stream(str.split("")))
        .forEach(System.out::println);
```
```java
List<List<Integer>> lists = List.of(
        List.of(1, 2, 3),
        List.of(4, 5, 6),
        List.of(7, 8, 9)
);
lists.forEach(System.out::println);

lists.stream()
        .flatMap(Collection::stream)
        .forEach(System.out::println);
```

## mapMulti

```java
Stream.of(1, 2, 3, 4, 5, 6)
        .mapMulti((x, consumer) -> {
            if (x % 2 == 0) {
                consumer.accept(-x);
                consumer.accept(x);
            }
        })
        .forEach(System.out::println);
```

## limit(long maxSize)
```java
Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .limit(4)
        .forEach(System.out::println);
```

## skip(long n)
```java
Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .skip(4)
        .forEach(System.out::println);
```
```java
IntStream.range(0, 10)
        .limit(5) // 0 1 2 3 4
        .skip(3) // 3 4
        .forEach(System.out::println);
```
```java
IntStream.range(0, 10) // 0 1 2 3 4 5 6 7 8 9
        .skip(5) // 5 6 7 8 9
        .limit(3) // 5 6 7
        .skip(1) // 6 7
        .forEach(System.out::println);
```

## sorted()
```java
Stream.of(654, 416, 4, 64, 1, 3, 84, 6)
        .sorted()
        .forEach(System.out::println);
```

## peek() distinct()
```java
Stream.of(0, 3, 0, 4, 5, 0, 4, 0, 0)
        .peek(x -> System.out.println("Before distinct - " + x))
        .distinct()
        .peek(x -> System.out.println("After distinct - " + x))
        .map(x -> x * x)
        .forEach(System.out::println);
```

## takeWhile(Predicat)
```java
Stream.of(1, 2, 1, 4, 5, 3, 41, 6, 4)
        .takeWhile(x -> x < 5)
        .forEach(System.out::println);
```
# Terminal operations
## forEach() forEachOrdered()
```java
IntStream.range(0,100)
        .parallel()
        .forEach(System.out::println);

IntStream.range(0,100)
        .parallel()
        .forEachOrdered(System.out::println);
```