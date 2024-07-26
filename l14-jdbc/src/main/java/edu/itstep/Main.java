package edu.itstep;


import edu.itstep.repository.UserRepository;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        // JDBC - java database connectivity
        // DAO - Data Access Object
        // ORM -
        //DriverManager
//        Driver
//        Statement
//        Connection
//        ResultSet
        UserRepository userRepository = new UserRepository();
//        userRepository.findAll();
//
//        Scanner scanner = new Scanner(System.in);

//        String name = scanner.nextLine();
//
//        userRepository.findByName(name);
//        userRepository.testResultSet();
//        ResultSet.TYPE_SCROLL_SENSITIVE
//        userRepository.testTransaction();
        long start = System.currentTimeMillis();

        System.out.println(start);
        System.out.println("BATCH");
        userRepository.testBatch();
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("INSERT in loop");
        userRepository.testInsert();
        System.out.println(System.currentTimeMillis() - start);


    }
}
