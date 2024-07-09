package com.dev.sectoremployee.controllers;

import com.dev.sectoremployee.entities.Employee;
import com.dev.sectoremployee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping
    public List<Employee> findAll(){
        List<Employee> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Employee findById(@PathVariable Integer id){
        Employee result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Employee insert(@RequestBody Employee employee) {
        Employee result = repository.save(employee);
        return result;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
