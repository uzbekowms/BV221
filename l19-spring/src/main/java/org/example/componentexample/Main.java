package org.example.componentexample;

import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.componentexample.config.AppConfig;
import org.example.componentexample.model.User;

import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
//        var context = new AnnotationConfigApplicationContext();
//        User bean = context.getBean(User.class);
//        System.out.println(bean);
        List<User> users = List.of(
                new User("Oleg", "admin"),
                new User("Petro", "manager"),
                new User("Ann", "admin"),
                new User("Joe", "admin"),
                new User("Doe", "manager")
        );
        for (User user : users) {
            if ("admin".equals(user.getRole())) {
                context.registerBean(user.getName(), User.class, () -> user);
            }
        }
        User bean = context.getBean("Petro", User.class);
        System.out.println(bean);
    }
}
