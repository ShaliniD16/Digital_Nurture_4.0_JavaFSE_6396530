package com.cognizant.spring_data_jpa_demo.service;

import com.cognizant.spring_data_jpa_demo.model.Employee;
import com.cognizant.spring_data_jpa_demo.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repo;


    @Transactional
    public Employee add(Employee e) {
        return repo.save(e);
    }


    public Employee get(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee " + id));
    }


    public List<Employee> list() {
        return repo.findAll();
    }


    @Transactional
    public Employee updateEmail(Integer id, String email) {
        Employee e = get(id);
        e.setEmail(email);
        return e;
    }


    @Transactional
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
