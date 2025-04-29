package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {

    final EmployeeService service;

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @GetMapping("/view-all")
    public List<Employee> viewAll(){
        return service.viewAll();
    }

    @PutMapping("/update-employee/{id}")
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteEmployee(id);
    }

    @GetMapping("/search-employee-by-id/{id}")
    public Employee searchEmployeeById(@PathVariable Integer id){
       return service.searchEmployeeById(id);
    }




}
