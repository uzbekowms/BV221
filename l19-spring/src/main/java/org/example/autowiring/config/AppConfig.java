package org.example.autowiring.config;

import org.example.autowiring.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.autowiring")
public class AppConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public UserRepository userRepository2() {
        return new UserRepository();
    }

    @Bean
    public UserRepository userRepository3() {
        return new UserRepository();
    }
}
