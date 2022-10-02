package com.edu.userservicerestv1.controllerv1;

import com.edu.userservicerestv1.dtos.UserDTO;
import com.edu.userservicerestv1.entity.User;
import com.edu.userservicerestv1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody UserDTO user){
        return userService.create(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/user/")
    public List<User> getUserByIdParam(
            @RequestParam(value = "username") String username
    ) {
        return userService.getAll();
    }



}
