package ru.itis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.itis.models.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //language=SQL
    private final String SQL_FIND_BY_EMAIL_PASSWORD = "select * from users where email=? and password=?";

    //language=SQL
    private final String SQL_SAVE = "insert into users (email, password) values (?, ?)";
    private RowMapper<User> userRowMapper = ((resultSet, i) -> User.builder()
            .email(resultSet.getString("email"))
            .password(resultSet.getString("password"))
            .build());

    @Override
    public Boolean getUserByEmailPassword(User user) {
        try {
            System.out.println(jdbcTemplate.queryForObject(SQL_FIND_BY_EMAIL_PASSWORD, userRowMapper, user.getEmail(), user.getPassword()));
            return jdbcTemplate.queryForObject(SQL_FIND_BY_EMAIL_PASSWORD, userRowMapper, user.getEmail(), user.getPassword()) != null;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean save(User user) {
        try {
            return jdbcTemplate.update(SQL_SAVE, user.getEmail(), user.getPassword()) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
