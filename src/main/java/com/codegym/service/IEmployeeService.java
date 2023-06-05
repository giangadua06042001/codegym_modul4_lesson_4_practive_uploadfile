package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    void save(Employee employeeService);
    Employee findById(int id);
    void update(int id, Employee employee);
    void remove(int id);
}
