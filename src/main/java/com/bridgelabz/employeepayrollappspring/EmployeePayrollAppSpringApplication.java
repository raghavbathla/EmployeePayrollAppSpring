package com.bridgelabz.employeepayrollappspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =  SpringApplication.run(EmployeePayrollAppSpringApplication.class, args);
        log.info("Employee Payroll Started environment in {} ",context.getEnvironment().getProperty("environment"));
    }

}
