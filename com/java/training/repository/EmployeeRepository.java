package com.java.training.repository;

import com.java.training.model.Employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository {
    List<Employee> employeeList=new ArrayList<>();
    public void saveEmployee(Employee employee){
        employeeList.add(employee);
    }
    public List<Employee> listEmployee() {
        return employeeList;
    }



}
