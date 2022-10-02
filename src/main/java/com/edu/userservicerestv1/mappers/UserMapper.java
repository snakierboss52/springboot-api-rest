package com.edu.userservicerestv1.mappers;

import com.edu.userservicerestv1.dtos.UserDTO;
import com.edu.userservicerestv1.entity.User;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static User toUserEntity(UserDTO userDTO){
        return new User (
                userDTO.getId(),
                userDTO.getEmail(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getUserName(),
                userDTO.getDateRegistry()
        );
    }

    public static UserDTO toUserDTO(User user){
        return new UserDTO (
                user.getId(),
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getUserName(),
                user.getDateRegistry()
        );
    }

}
