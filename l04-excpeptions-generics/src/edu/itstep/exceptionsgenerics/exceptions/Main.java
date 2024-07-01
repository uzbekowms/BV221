package edu.itstep.exceptionsgenerics.exceptions;

import edu.itstep.exceptionsgenerics.exceptions.exception.BuilderException;
import edu.itstep.exceptionsgenerics.exceptions.model.Builder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws BuilderException {
//        try {
//            System.out.println(5 / 0);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finnaly");
//        }
//        System.out.println("End");
//        testTry();
//        testFinally();
        // StackOverflowError

//        try {
//            FileInputStream fileInputStream = new FileInputStream("./file.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Exception");
//        }
//
//        testCheckedException();
//        testUncheckedException();
//        System.out.println(5 / 0);
        try {
            Builder builder = new Builder(3);
            builder.driverTheNail();
            builder.build();
            builder.driverTheNail();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void testCheckedException() throws IOException {

    }

    public static void testUncheckedException() throws ArithmeticException {

    }

    public static boolean testTry() {
        try {
            System.out.println("Try");
            return true;
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finnaly");
        }
        return false;
    }

    public static void testFinally() {
        try {
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finnaly");
        }
    }

    public static void f() {
        f();
    }
}
