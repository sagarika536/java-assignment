package com.java.training.Controller;

import com.java.training.Service.EmployeeService;

public class EmployeeController {
    EmployeeService empservice=new EmployeeService();
    public void createEmployee(String name,int id,int age,int salary){
        empservice.createEmployee(name,id,age,salary);
    }
    public void listEmployee(){
        empservice.listEmployee();
    }
    public void deleteEmployee(int deleteid){
         empservice.deleteEmployee(deleteid);
        }
        public void updateEmployee(int updateid){
        empservice.updateEmployee(updateid);
        }

}
