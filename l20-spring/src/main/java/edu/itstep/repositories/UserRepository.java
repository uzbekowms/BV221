package edu.itstep.repositories;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class UserRepository {
    {
        System.out.println("UserRepository initialized");
    }
}
