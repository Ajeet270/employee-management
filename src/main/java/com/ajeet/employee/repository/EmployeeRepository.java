package com.ajeet.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajeet.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
