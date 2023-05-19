package com.projects.employeemanagementsystembackend.repository;

import com.projects.employeemanagementsystembackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
