package edu.itstep.iostreams;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        System.err.println("Hello world");
//
//        FileInputStream

        String filename = "data" + File.separator + "text.txt";
        String dirname = System.getProperty("user.dir");
        String pathToFile = dirname + File.separator + filename;
        System.out.println(pathToFile);

        File file = new File(pathToFile);
//        file.setWritable(false);


//        InputStream inputStream = new FileInputStream(file);
//        int c;
//        while ((c = inputStream.read()) != -1) {
//            System.out.print((char) c);
//        }


//        while (inputStream.available() > 0) {
//            System.out.print((char) inputStream.read());
//        }
//        byte[] arr = new byte[5];
//        inputStream.read(arr);
//
//        System.out.println(arr);
//        for (byte b : arr
//        ) {
//            System.out.println((char) b);
//        }
//        byte[] arr = new byte[inputStream.available()];
//        inputStream.read(arr);
//
//        for (byte b : arr) {
//            System.out.print((char) b);
//        }
//
//
//        OutputStream outputStream = new FileOutputStream(file);
//        outputStream.write(65);
//        outputStream.write(66);
//        outputStream.write(67);
//        outputStream.write(68);
//        System.out.println();
//        alphabet('a', 'e');
//        alphabet('a', 'e');
//        BufferedInputStream bis = new BufferedInputStream(inputStream);
//        while (bis.available() > 0) {
//            System.out.print((char) bis.read());
//        }
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
//        bos.write(65);
//        bos.write(66);
//        bos.write(72);
//        bos.flush();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject(new Fish(1, "Salmon"));
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        Fish fish = (Fish) objectInputStream.readObject();
//
//        System.out.println(fish.getAge());
//        System.out.println(fish.getName());

//        FileReader fileReader = new FileReader(file);
//        FileWriter fileWriter = new FileWriter(file);
//        Scanner scanner = new Scanner(new FileInputStream(file));
//        System.out.println(scanner.nextLine());

        User user = selectUser();

        System.out.println(user.getPosts());
    }

    public static User selectUser(){
        return new UserProxy(1, "a", List.of(new Post("asdas", "asdasd")));
    }

    static class Fish implements Serializable {
        private int age;
        private String name;
        @Serial
        private static final long serialVersionUID = 2L;

        public Fish(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static void alphabet(char start, char end) {
        for (int i = start; i <= end; i++) {
            System.out.println((char) i);
        }
    }
}