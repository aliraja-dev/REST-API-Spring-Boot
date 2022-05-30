package com.alirajadev.department.repository;

import org.springframework.stereotype.Repository;

import com.alirajadev.department.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
