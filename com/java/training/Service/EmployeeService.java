package com.java.training.Service;

import com.java.training.model.Employee;
import com.java.training.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    EmployeeRepository emprepo=new EmployeeRepository();
    Scanner sc=new Scanner(System.in);


    public void createEmployee(String name,int id,int age,int salary){
        Employee emp=new Employee();

        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setAge(age);
        emprepo.saveEmployee(emp);

    }
    List<Employee> employeelist = emprepo.listEmployee();
    public void listEmployee() {

        for (Employee emp : employeelist) {
            System.out.println(emp);
        }
    }
    public void deleteEmployee(int deleteid){
        for (Employee emp : employeelist)
        if(emp.getId()==deleteid)
            employeelist.remove(emp);
    }
    public void updateEmployee(int updateid){
        for (Employee emp : employeelist)
            if(emp.getId()==updateid){
                System.out.println("enter employee name");
                String name = sc.next();
                System.out.println("enter employee id");
                int id=sc.nextInt();
                System.out.println("enter employee salary");
                int salary = sc.nextInt();
                System.out.println("enter employee age");
                int age = sc.nextInt();
                emp.setName(name);
                emp.setId(id);
                emp.setSalary(salary);
                emp.setAge(age);
            }
    }
  //  List<Employee> employeelist = emprepo.listEmployee();

}
