package org.example.autowiring;

import org.example.autowiring.config.AppConfig;
import org.example.autowiring.service.UserService;
import org.example.autowiring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user = new User(1, "Petro");

        userService.save(user);
    }
}
