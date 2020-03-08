package com.authentication.encryption.Service;

import com.authentication.encryption.DAO.EmployeeDaoImpl;
import com.authentication.encryption.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmoloyeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDao;
    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void insertEmployees(List<Employee> employees) {
        employeeDao.insertEmployees(employees);
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public void getEmployeeById(String empId) {
        Employee employee = employeeDao.getEmployeeById(empId);
        System.out.println(employee);
    }

}
