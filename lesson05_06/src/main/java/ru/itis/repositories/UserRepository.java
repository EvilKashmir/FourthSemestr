package ru.itis.repositories;

import ru.itis.models.User;

import java.util.Optional;

public interface UserRepository {
    boolean save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findById(long id);
}
