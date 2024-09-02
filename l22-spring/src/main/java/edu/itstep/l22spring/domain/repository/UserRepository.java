package edu.itstep.l22spring.domain.repository;

import edu.itstep.l22spring.domain.model.User;
import edu.itstep.l22spring.domain.service.UserRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;
    private final UserRowMapper userRowMapper;

    @Transactional
    public List<User> findAll() {
        String sql = """
                SELECT *
                FROM users
                """;

        return jdbcTemplate.query(sql, userRowMapper);
    }
}
