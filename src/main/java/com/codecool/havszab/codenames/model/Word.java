package com.codecool.havszab.codenames.model;

import javax.persistence.*;

@Entity
public class Word {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String content;

    @ManyToOne
    private Game game;


}
