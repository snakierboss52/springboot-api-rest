package com.edu.userservicerestv1.service;

import com.edu.userservicerestv1.dtos.UserDTO;
import com.edu.userservicerestv1.entity.User;
import com.edu.userservicerestv1.mappers.UserMapper;
import com.edu.userservicerestv1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserDTO create(UserDTO user) {
        final User userEntity = UserMapper.toUserEntity(user);
        userRepository.save(userEntity);
       return UserMapper.toUserDTO(userEntity);
    }
}
