package com.boris.rwa.controllers;

import com.boris.rwa.models.Employee;
import com.boris.rwa.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private static final List<Employee> employees = new ArrayList<>();
    static {
        for(int i=0;i<10;i++) {
            employees.add(new Employee(i, "Employee" + i, "E" + i, "Chef"));
        }
    }

    @GetMapping
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "employees";
    }
}
