package com.codecool.havszab.codenames.model;

import javax.persistence.*;

@Entity
@Table(name = "info")
public class Info {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Column(name = "body_text", columnDefinition = "text")
    private String bodyText;

    @Column(name = "img_path")
    private String imgPath;

    public Info() {
    }

    public Info(String title, String bodyText, String imgPath) {
        this.title = title;
        this.bodyText = bodyText;
        this.imgPath = imgPath;
    }

}