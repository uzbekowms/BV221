package org.example.project.repositories;

import org.example.autowiring.model.User;

public interface UserRepository {

    User getById(int id);
}
