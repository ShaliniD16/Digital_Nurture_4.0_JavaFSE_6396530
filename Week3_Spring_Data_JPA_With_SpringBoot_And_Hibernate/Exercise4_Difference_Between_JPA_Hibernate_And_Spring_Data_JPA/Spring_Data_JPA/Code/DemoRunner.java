package com.cognizant.spring_data_jpa_demo.runner;

import com.cognizant.spring_data_jpa_demo.model.Employee;
import com.cognizant.spring_data_jpa_demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DemoRunner implements CommandLineRunner {

    private final EmployeeService service;

    @Override
    public void run(String... args) {
        // CREATE
        Employee e = service.add(new Employee(null, "Alice", "Doe", "alice@example.com"));
        System.out.println("Created: " + e);

        // READ
        Employee fetched = service.get(e.getId());
        System.out.println("Fetched: " + fetched);

        // UPDATE
        Employee updated = service.updateEmail(e.getId(), "alice@updated.com");
        System.out.println("Updated: " + updated);

        // DELETE
        service.delete(e.getId());
        System.out.println("Deleted employee with ID: " + e.getId());
    }
}

