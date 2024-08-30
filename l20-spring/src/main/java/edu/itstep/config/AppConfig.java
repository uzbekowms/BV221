package edu.itstep.config;

import edu.itstep.repositories.UserRepository;
import edu.itstep.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("edu.itstep")
public class AppConfig {


    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(UserRepository userRepository) {
        return new CommentService(userRepository);
    }

}
