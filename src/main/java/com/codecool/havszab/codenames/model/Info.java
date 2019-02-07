package com.codecool.havszab.codenames.model;

import javax.persistence.*;

@Entity
@Table(name = "game_advices")
public class Info {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Column(name = "body_text", columnDefinition = "text")
    private String bodyText;

    @Column(name = "img_path")
    private String imgPath;

    @Column
    private int height;

    @Column
    private int width;

    public Info() {
    }

    public Info(String title, String bodyText, String imgPath) {
        this.title = title;
        this.bodyText = bodyText;
        this.imgPath = imgPath;
    }

    public Info(String title, String bodyText, String imgPath, int width, int height) {
        this.title = title;
        this.bodyText = bodyText;
        this.imgPath = imgPath;
        this.height = height;
        this.width = width;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}