package com.cognizant.spring_data_jpa_demo.repository;

import com.cognizant.spring_data_jpa_demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {}

