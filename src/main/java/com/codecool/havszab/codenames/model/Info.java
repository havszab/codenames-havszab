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
    private int imgHeight;

    @Column
    private int imgWidth;

    @Column
    private int posX;

    @Column
    private int posY;

    @Column
    private int height;

    @Column
    private int width;

    public Info() {

    }

    public Info(String title, String bodyText, String imgPath, int imgWidth, int imgHeight, int posX, int posY, int height, int width) {
        this.title = title;
        this.bodyText = bodyText;
        this.imgPath = imgPath;
        this.imgHeight = imgHeight;
        this.imgWidth = imgWidth;
        this.posX = posX;
        this.posY = posY;
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

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}