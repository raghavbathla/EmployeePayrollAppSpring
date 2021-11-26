package com.bridgelabz.employeepayrollappspring.services;

import com.bridgelabz.employeepayrollappspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappspring.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollServices {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int employeeId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int employeeId);
    List<EmployeePayrollData> getEmployeesPayrollDataByDepartment(String department);
}
