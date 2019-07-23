package com.elms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elms.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
