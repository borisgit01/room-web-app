package com.boris.rwa.service;

import com.boris.rwa.models.Employee;
import com.boris.rwa.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private static final List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(UUID.randomUUID(), "William", "Riker", Position.CONCIERGE.toString()));
        employees.add(new Employee(UUID.randomUUID(), "Jean-Luc", "Picard", Position.SECURITY.toString()));
        employees.add(new Employee(UUID.randomUUID(), "Deanna", "Troi", Position.HOUSEKEEPING.toString()));
        employees.add(new Employee(UUID.randomUUID(), "Beverly", "Crusher", Position.FRONT_DESK.toString()));
    }

    public List<Employee> getAllEmployees() {return employees;}
}
