package com.dangercode.aopmodel.service;

import com.dangercode.aopmodel.entity.Employee;
import com.dangercode.aopmodel.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee addEmployee(Employee e) {
        return employeeRepo.save(e);
    }
}
