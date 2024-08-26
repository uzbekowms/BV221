package org.example.wiring.config;


import org.example.wiring.model.User;
import org.example.wiring.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Dog dog() {
        System.out.println("DOG");
        return new Dog("Megatron");
    }

    @Bean
    public User user(Dog dog) {
        User user = new User();
        user.setName("Oleg");
        user.setDog(dog);
        return user;
    }

}
