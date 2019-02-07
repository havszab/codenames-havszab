package com.codecool.havszab.codenames.model;

import javax.persistence.*;

@Entity
public class Game {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    

}
