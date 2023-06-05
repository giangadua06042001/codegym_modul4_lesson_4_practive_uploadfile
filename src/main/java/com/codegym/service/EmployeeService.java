package com.codegym.service;

import com.codegym.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeList.get(id);
    }

    @Override
    public void update(int id, Employee employee) {
        for (Employee employees : employeeList) {
            if (employees.getId() == id) {
                employees = employee;
                break;
            }
        }
    }

    @Override
    public void remove(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(id);
                break;
            }
        }
    }
}
