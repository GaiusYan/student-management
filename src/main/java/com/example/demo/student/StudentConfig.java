package com.example.demo.student;

import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student gaius =  new Student(
                    "User exemple",
                    LocalDate.of(2000, Month.JUNE,12),
                    "userExemple@gmail.com"
            );

            Student yanbena =  new Student(
                    "Example",
                    LocalDate.of(2004, Month.DECEMBER,22),
                    "example@gmail.com"
            );

            repository.saveAll(List.of(gaius,yanbena));
        };
    }
}
