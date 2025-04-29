package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor


public class EmployeeController {

    final EmployeeService service;

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

}
