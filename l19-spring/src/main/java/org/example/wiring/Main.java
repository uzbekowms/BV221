package org.example.wiring;

import org.example.wiring.config.AppConfig;
import org.example.wiring.model.Dog;
import org.example.wiring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = context.getBean(User.class);
        Dog dog = context.getBean(Dog.class);

        System.out.println(user.getName());
        System.out.println(dog.getName());

        System.out.println(user.getDog());

        System.out.println(dog == user.getDog());
    }
}
