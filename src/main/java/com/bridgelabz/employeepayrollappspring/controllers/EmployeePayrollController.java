package com.bridgelabz.employeepayrollappspring.controllers;

import com.bridgelabz.employeepayrollappspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappspring.dto.ResponseDto;
import com.bridgelabz.employeepayrollappspring.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollappspring.services.IEmployeePayrollServices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employeepayroll")
@Slf4j
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollServices iEmployeePayrollServices;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDto> getEmployeePayrollData(){
        List<EmployeePayrollData> data = null;
        data = iEmployeePayrollServices.getEmployeePayrollData();
        ResponseDto responseDto =  new ResponseDto("Get Call Success",data);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    @GetMapping(value = {"get/{empId}"})
    public ResponseEntity<ResponseDto> getEmployeePayrollData(@PathVariable ("empId") int empID){
        EmployeePayrollData employeePayrollData = iEmployeePayrollServices.getEmployeePayrollDataById(empID);
        ResponseDto responseDto =  new ResponseDto("Get Call Success",employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addEmployeePayrollData(
           @Valid  @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = iEmployeePayrollServices.createEmployeePayrollData(employeePayrollDTO);
        ResponseDto responseDto =  new ResponseDto("Get Call Success",employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDto> updateEmployeePayrollData(
            @PathVariable("empId") int employeeId ,
            @RequestBody EmployeePayrollDTO employeePayrollDTO) {
   EmployeePayrollData employeePayrollData = iEmployeePayrollServices.updateEmployeePayrollData(employeeId,employeePayrollDTO);
        ResponseDto responseDto =  new ResponseDto("Get Call Success",employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("employeeId") int employeeId) {
iEmployeePayrollServices.deleteEmployeePayrollData(employeeId);
        return new ResponseEntity<String>("Deleted"+employeeId, HttpStatus.OK);
    }
    @GetMapping("/department/{department}")
    public ResponseEntity<ResponseDto> getEmployeeByDepartment(@PathVariable String department) {

        List<EmployeePayrollData> employeeList = null;
        employeeList = iEmployeePayrollServices.getEmployeesPayrollDataByDepartment(department);
        ResponseDto response = new ResponseDto("Get Call for Department Successful", employeeList);
        return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
    }
}
