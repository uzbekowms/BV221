package org.example.beansexample.config;

import org.example.beansexample.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    {
        System.out.println("AppConfig init");
    }

    @Bean("oleg")
    @Primary
    public User user() {
        System.out.println("User init");
        return new User("Oleg");
    }

    @Bean("petro")
    public User user2() {
        return new User("Petro");
    }

    @Bean("misha")
    public User user3() {
        return new User("Misha");
    }

//    @Bean
//    public String greetings() {
//        return "hello";
//    }
//
//    @Bean
//    public Integer age() {
//        return 20;
//    }
}

