package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(EmployeeRepository employeeRepository) {
        return args -> {
            employeeRepository.save(new Employee("pippo1", "pluto1", "paperino1"));
            employeeRepository.save(new Employee("pippo2", "pluto2", "paperino2"));
        };
    }

}
