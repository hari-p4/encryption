package com.authentication.encryption.Service;

import com.authentication.encryption.Model.Employee;

import java.util.List;

public interface EmployeeService {
    void insertEmployee(Employee emp);
    void insertEmployees(List<Employee> employees);
    List<Employee> getAllEmployees();
    void getEmployeeById(String empid);

}
