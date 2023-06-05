package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class  Employee {
    private int id;
    private String name;
    private String address;
    private String email;
    private double salary;


    private String  image;

    public Employee() {
    }

    public Employee(int id, String name, String address, String email,  String image,double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary=salary;
        this.image = image;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
