package com.codecool.havszab.codenames.service;

import com.codecool.havszab.codenames.model.User;
import com.codecool.havszab.codenames.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserInitializer {

    public UserInitializer(UserRepository userRepository) {

        userRepository.save(new User(
                "TheFirst",
                "hahaha",
                "havsza@gmail.com"
        ));
    }
}
