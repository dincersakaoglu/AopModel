package com.dangercode.aopmodel.controller;

import com.dangercode.aopmodel.entity.Employee;
import com.dangercode.aopmodel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/code")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<?> fetchAll(){
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee e){
        return new ResponseEntity<Employee>(employeeService.addEmployee(e),HttpStatus.OK);
    }
}
