package edu.itstep;

import edu.itstep.config.AppConfig;
import edu.itstep.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

//        UserRepository userRepository = context.getBean(UserRepository.class);
        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(CommentService.class);

        System.out.println(cs1 == cs2);

        System.out.println(cs1.getId());
        System.out.println(cs2.getId());

        System.out.println(cs1.getUserRepository() == cs2.getUserRepository());
    }
}
