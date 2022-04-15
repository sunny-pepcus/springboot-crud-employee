package com.pepcus.trainee.case_study2.repository;

import com.pepcus.trainee.case_study2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
