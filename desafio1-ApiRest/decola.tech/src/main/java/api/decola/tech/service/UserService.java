package api.decola.tech.service;

import api.decola.tech.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}