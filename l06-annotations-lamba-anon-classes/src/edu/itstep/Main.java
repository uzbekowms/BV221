package edu.itstep;

//import edu.itstep.annotations.Group;

import edu.itstep.anonclasses.Group;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Main {

    //    @Group(value = "Some Group")
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        @SuppressWarnings("'Integer(int)' is deprecated since version 9 and marked for removal ")
//        Integer i = new Integer(5);
//        class A{
//
//        }
//        Group pinkFloyd = new Group() {
//            private int a = 10;
//
//            @Override
//            public String bestAlbum() {
//                return "Wish you were here";
//            }
//
//            private String something() {
//                return "";
//            }
//
//            class A {
//
//            }
//        };

        Group pinkFloyd = param -> {
            System.out.println("Hello World");
            return "With you were Here";
        };


        JPanel panel = new JPanel();

        JButton jButton = new JButton("Hello");


        jButton.addActionListener(e -> System.out.println("Clicked"));
        panel.add(jButton);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//
//        List<String> list = new List<String>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<String> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends String> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends String> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public String get(int index) {
//                return "";
//            }
//
//            @Override
//            public String set(int index, String element) {
//                return "";
//            }
//
//            @Override
//            public void add(int index, String element) {
//
//            }
//
//            @Override
//            public String remove(int index) {
//                return "";
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<String> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<String> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<String> subList(int fromIndex, int toIndex) {
//                return List.of();
//            }
//        };

    }

    interface UnaryOperator<T> {
        T apply(T t);
    }
}