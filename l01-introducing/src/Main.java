import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

class Human{

    String name;
}

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello world!");
        //Ctrl + Alt + L - format document
        // Ctrl + D - duplicate line
        // Ctrl + D - duplicate line
        // Ctrl + Shift + Arrows (Up/Down) - move code
        // Ctrl + Space

        // Stack - primitives, link
        // Heap - object

        // byte
        // short
        // int
        // long

        // float - 4
        // double - 8

//        // char - 2
//        char a = 'a';
//
//        // boolean
//        short i = 3;
//        int j = i;
//        long l = 5222222222222L;
        // Ctrl + /

//        byte a = 37;
//        short b = 12;
//        char c = 'a';
//        int sum = a + b + c;
//        System.out.println(sum);


        /*                                  | Втрата точності
         * byte      | short, int, long      | No
         * short     | int, long             | No
         * int       | long                  | No
         * int       | float, double         | Yes
         * char      | int                   | No
         * long      | float, double         | Yes
         * float     | double                | No
         * */
//        int big = 1234567890;
//        float f = big;
//        System.out.println(f);

//        int i = (int) 7L;
//        float f = (float) 2.5;
//        int j = 12;
//        byte b = (byte) j;
//
//        System.out.println(i);
//        System.out.println(f);
//        System.out.println(j);
//        System.out.println(b);

//        byte b = 55;
//        b = b * 2;
//
//        byte b = 127;
//        b++;
//        System.out.println(b);

        // Shift + F10 - Run project
//
//        short s = 256;
//        byte b = (byte) s;
//        System.out.println(b);

//        double d = 0.3333333333333333;
//        float f = (float) d;
//        System.out.println(f);
//
//        float f = 3.64f;
//        int i = (int) f;
//        System.out.println(i);
//
//        Integer.valueOf()
//        String text = "Hello";
//        String text2 = "Hello";
//        String text3 = new String("Hello");
//
//        System.out.println(text == text2);
//        System.out.println(text == text3);
//        System.out.println(text.equals(text3));

//        Integer i = 5;
//        Boolean b = true;
//
//        int i = Integer.valueOf(5);
//
//        test(5);
//        Integer i = null;
//        int j = i;
//
//        Number n = 555;
//        byte b = (Byte) n;
//        System.out.println(n);

        //

        /*
         *
         * */
        // camelCase
        // class PascalCase
        // Runnable
        // Cloneable
//        {
//            int x = 12;
//        }
//        System.out.println(x);
//        System.out.println(0x3);
//        System.out.println(3L);
//        System.out.println(3f);
//        System.out.println(3F);
//        System.out.println(3e-1f);
//        System.out.println(2.5D);
//        System.out.println(2.5d);
//        System.out.println(true);
//        System.out.println(false);
//        System.out.println('a');
//        System.out.println(null);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(+2);
//        System.out.println(2 + 2);
//        System.out.println( 2 > 2 ? 3 : 4);

//        System.out.println(4 >> 1);
//        System.out.println(4 << 1);
//        System.out.println(4 >>> 1);
//        System.out.println(4 & 1);
//        System.out.println(4 | 1);
//
//        int a = 5;
//        int b = 5;
//        System.out.println(a++);
//        System.out.println(++b);
//
//
//        System.out.println(1 ^ 5);
//        System.out.println(~5);
//        if () {
//
//        } else if () {
//
//        } else {
//
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        String[] arr = {"1", "2", "3", "4", "5"};
//        for (String s : arr) {
//            System.out.println(s);
//        }
//        if (3 > 2) return;
//        else System.out.println("");
//        System.out.println("");

//        int i = 5;
//        String result = switch (i) {
//            case 1 -> {
//                yield "Hello";
//            }
//            default -> "";
//        };
//        int i = 0;
//        while (true){
//
//            i++;
//        }
//        for (; ;) {
//
//        }
//        for (){
//
//        }
//        do{
//
//        }while (){
//
//        }
//        int a, b;
//        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
//
//        outer:
//        while (true){
//            inner:
//            while (true){
//                continue outer;
//            }
//        }

//         System.out.println("sum = " + (1 + 2));
//         System.out.println("mul = " + 2 * 3);
//         System.out.println(1 + 2 + " = 3");
//        System.out.println("""
//                asdasd
//                \tasdasdas
//                """);
//        String name = "Sasha";
//        System.out.println(STR."Hello \{name}");
//        System.out.print("");
//        Scanner sc = new Scanner(System.in);
        
    }

    public static void task1(){

    }

//    public static String test(Object o) {
//        return switch (o) {
//            case Integer i -> "Int";
//            case Double d when d > 5 -> "Double";
//            case null -> "";
//            default -> "None";
//        };
//    }
//
//    public static void test(Integer value) {
//        System.out.println(value);
//    }
}