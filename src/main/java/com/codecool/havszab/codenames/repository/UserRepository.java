package com.codecool.havszab.codenames.repository;

import com.codecool.havszab.codenames.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getByUsername(String username);
}
