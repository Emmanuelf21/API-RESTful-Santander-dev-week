package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
    User findById(Long id);
    void delete(Long id);
    User create(User userToCreate);
}
