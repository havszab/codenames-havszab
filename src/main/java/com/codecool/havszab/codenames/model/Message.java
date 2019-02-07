package com.codecool.havszab.codenames.model;

import javax.persistence.*;

@Entity
class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @ManyToOne
    private Chat gameChat;

    @ManyToOne
    private User author;
}
