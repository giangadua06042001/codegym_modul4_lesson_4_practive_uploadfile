package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class Product {
    private int id;

    private String name;

    private String description;
//    private MultipartFile image_description;

    private String image;

    public Product() {
    }

//    public MultipartFile getImage_description() {
//        return image_description;
//    }
//
//    public void setImage_description(MultipartFile image_description) {
//        this.image_description = image_description;
//    }

    public Product(int id, String name, String description, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
//        this.image_description=image_description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
