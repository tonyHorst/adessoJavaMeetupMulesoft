package se.adesso.employeedata.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.adesso.employeedata.entities.Employee;
import se.adesso.employeedata.services.EmployeeService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll() throws IOException {
        return employeeService.getAll();
    }
}
