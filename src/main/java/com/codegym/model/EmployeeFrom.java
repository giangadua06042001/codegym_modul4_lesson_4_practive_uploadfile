package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class EmployeeFrom {
    private int id;
    private String name;
    private String address;
    private String email;
    private double salary;
    private MultipartFile image;

    public EmployeeFrom(int id, String name, String address, String email, double salary, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
        this.image = image;
    }

    public EmployeeFrom() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
