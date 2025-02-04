package br.com.api.service;

import br.com.api.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate) throws IllegalAccessException;
}
