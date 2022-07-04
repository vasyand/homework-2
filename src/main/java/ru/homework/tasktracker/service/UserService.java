package ru.homework.tasktracker.service;

import ru.homework.tasktracker.model.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    void save(User user);

    void delete(Long id);

    void update(User user);
}
