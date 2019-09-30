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
    CommandLineRunner initData(EmployeeRepository employeeRepository, ManagerRepository managerRepository) {
        return args -> {
            Manager mpluto = new Manager("mpluto");
            managerRepository.save( mpluto);

            employeeRepository.save(new Employee("pippo1", "pluto1", "paperino1", mpluto));
            employeeRepository.save(new Employee("pippo2", "pluto2", "paperino2", mpluto));
        };
    }

}
