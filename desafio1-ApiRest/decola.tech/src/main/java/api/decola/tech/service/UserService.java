package api.decola.tech.service;

import api.decola.tech.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO findById(Long id);

    UserDTO create(UserDTO userToCreate);

    List<UserDTO> findAll();

    UserDTO update(Long id, UserDTO userToUpdate);

    void delete(Long id);
}
