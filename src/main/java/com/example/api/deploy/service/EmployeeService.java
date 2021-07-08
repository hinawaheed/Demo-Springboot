package com.example.api.deploy.service;

import com.example.api.deploy.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<Employee> emps = List.of(
            new Employee("Hina","Tech",1),
            new Employee("Tabinda","Tech",2),
            new Employee("Essam","Tech",3)

    );
    public List<Employee> getAllEmp(){
        return emps;
    }
    public List<Employee> getSingleEmp(int id){
        return  emps.stream().filter(e->e.getId()==id).collect(Collectors.toList());
    }
}
