package com.example.myApp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student zakaria = new Student(
                    "zakaria",
                    22,
                    LocalDate.of(2000, Month.JUNE, 29),
                    "zakaria.yahia@gmail.com"
            );
            Student amine = new Student(
                    "amine",
                    21,
                    LocalDate.of(2001, Month.AUGUST, 22),
                    "amine.marouane@gmail.com"
            );
            repository.saveAll(
                    List.of(zakaria, amine)
            );
        };
    }
}
