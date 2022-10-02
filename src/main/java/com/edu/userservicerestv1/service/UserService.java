package com.edu.userservicerestv1.service;

import com.edu.userservicerestv1.dtos.UserDTO;
import com.edu.userservicerestv1.entity.User;
import com.edu.userservicerestv1.exceptions.RequestException;
import com.edu.userservicerestv1.mappers.UserMapper;
import com.edu.userservicerestv1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        if(userRepository.findById(id).isPresent()) {
            return userRepository.findById(id);
        }
        throw new RequestException("User not found", "P-414");
    }

    public List<User> getUserByUsername(String username){
        return userRepository.findAllByUserName(username);
    }

    @Override
    public UserDTO create(UserDTO user) {
        final User userEntity = UserMapper.toUserEntity(user);
        userRepository.save(userEntity);
       return UserMapper.toUserDTO(userEntity);
    }
}
