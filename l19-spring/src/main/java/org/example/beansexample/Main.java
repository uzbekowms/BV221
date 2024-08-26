package org.example.beansexample;

import org.example.beansexample.config.AppConfig;
import org.example.beansexample.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Double user = context.getBean(Double.class);
//        User user = context.getBean(User.class);
//        System.out.println(user);
//
//        String greetings = context.getBean(String.class);
//        System.out.println(greetings);
//
//        Integer age = context.getBean(Integer.class);
//        System.out.println(age);

//        User user = context.getBean("petro", User.class);
//        System.out.println(user);

    }
}