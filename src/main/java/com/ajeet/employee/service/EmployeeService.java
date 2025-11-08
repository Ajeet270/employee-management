package com.ajeet.employee.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ajeet.employee.entity.Employee;
import com.ajeet.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee addEmployee(Employee e) {
        return repo.save(e);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "Employee removed";
    }
    
    public Employee updateEmployee(Employee e, int id) {
        Employee existing = repo.findById(id).orElse(null);
        if(existing != null) {
            existing.setName(e.getName());
            existing.setDepartment(e.getDepartment());
            existing.setSalary(e.getSalary());
            return repo.save(existing);
        }
        return null;
    }

}
