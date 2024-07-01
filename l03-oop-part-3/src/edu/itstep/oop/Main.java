package edu.itstep.oop;

import edu.itstep.oop.model.User;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        KeyRecord keyRecord = new KeyRecord(12);
//        keyRecord.key();
//        System.out.println(new User("name", 10).hashCode());
//        System.out.println(new User("n", 13).hashCode());
        // abstract class vs interface
        List<Moveable> moveables = List.of(new Person(), new Ball());

        for (Moveable moveable : moveables) {
            moveable.right();
        }
//        FileInputStream fileInputStream = new FileInputStream("aasd");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        try (fileInputStream; bufferedInputStream) {
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        var name = "asda";

        Car car = new Car();
        try (car) {
            System.out.println("In try");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");
    }
}

class Car implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Close car");
    }
}

abstract class State {

    private int state;

    public abstract void doWork();

    public void doSomething() {

    }
}

//class SomeState extends State implements IState {
//
//    @Override
//    public void doWork() {
//
//    }
//}
//
interface IState {
    int STATE = 1;
}

interface Moveable {
    void right();

    void left();

    void up();

    void down();
}

class Ball implements Moveable {

    @Override
    public void right() {
        
    }

    @Override
    public void left() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}

class Person implements Moveable {

    @Override
    public void right() {

    }

    @Override
    public void left() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}

// User -> UserRepository -> UserService