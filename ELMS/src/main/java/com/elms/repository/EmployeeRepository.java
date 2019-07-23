package com.elms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elms.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
