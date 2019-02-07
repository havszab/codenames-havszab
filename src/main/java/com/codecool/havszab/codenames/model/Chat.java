package com.codecool.havszab.codenames.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chat {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Message> message;

    @ManyToMany(mappedBy = "chats", cascade = CascadeType.PERSIST)
    private List<User> users;

}
