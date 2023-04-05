package com.boris.rwa.service;

import com.boris.rwa.data.EmployeeRepository;
import com.boris.rwa.models.Employee;
import com.boris.rwa.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {return employeeRepository.findAll();}
}
