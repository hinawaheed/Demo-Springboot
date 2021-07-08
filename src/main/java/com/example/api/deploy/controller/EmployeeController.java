package com.example.api.deploy.controller;

import com.example.api.deploy.model.Employee;
import com.example.api.deploy.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @RequestMapping("/Employee")
        public List<Employee> getAllEmp(){
        return empService.getAllEmp();

    }
    @RequestMapping("/Employee/{id}")
    public List<Employee> getSingleEmp(@PathVariable int id){
        return empService.getSingleEmp(id);
    }
}
