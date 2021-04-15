package ru.itis.repository;

import ru.itis.models.User;

public interface UserRepository {
    Boolean getUserByEmailPassword(User user);
    Boolean save(User user);
}
