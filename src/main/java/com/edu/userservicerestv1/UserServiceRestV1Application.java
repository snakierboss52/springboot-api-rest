package com.edu.userservicerestv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.edu.userservicerestv1")
@SpringBootApplication
public class UserServiceRestV1Application {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceRestV1Application.class, args);
    }

}
