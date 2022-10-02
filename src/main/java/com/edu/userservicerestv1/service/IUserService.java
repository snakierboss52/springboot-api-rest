package com.edu.userservicerestv1.service;

import com.edu.userservicerestv1.dtos.UserDTO;

import javax.validation.Valid;

public interface IUserService {

    UserDTO create(@Valid UserDTO user);

}
