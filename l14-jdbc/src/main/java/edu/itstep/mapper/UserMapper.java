package edu.itstep.mapper;

import edu.itstep.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;

public class UserMapper implements Function<ResultSet, User> {
    @Override
    public User apply(ResultSet resultSet) {
        User user = new User();
        try {
            user.setId(resultSet.getInt("id"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
