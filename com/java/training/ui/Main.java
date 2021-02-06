package com.java.training.ui;

import com.java.training.Controller.EmployeeController;
import com.java.training.Controller.ProjectController;
import com.java.training.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static EmployeeController empcontroller = new EmployeeController();
    static ProjectController projectcontroller = new ProjectController();

    public static void main(String[] args) {
        printInstructions();
        boolean quit = true;
        while (quit) {
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    createEmployee();
                    break;
                case 2:
                    listEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    printInstructionsforproject();
                    break;

            }

        }
    }

    public static void createEmployee() {
        System.out.println("enter employee details");
        System.out.println("enter employee name");
        String name = sc.next();
        System.out.println("enter employee id");
        int id = sc.nextInt();
        System.out.println("enter employee salary");
        int salary = sc.nextInt();
        System.out.println("enter employee age");
        int age = sc.nextInt();
        empcontroller.createEmployee(name, id, salary, age);
    }

    public static void listEmployee() {
        empcontroller.listEmployee();
    }

    public static void deleteEmployee() {
        System.out.println("enter delete id");
        int deleteid = sc.nextInt();
        empcontroller.deleteEmployee(deleteid);
    }

    public static void updateEmployee() {
        System.out.println("enter updated employeeid details");
        int updateid = sc.nextInt();
        empcontroller.updateEmployee(updateid);
    }

    public static void printInstructions() {
        System.out.println("choose your choice");
        System.out.println("1.create employee details");
        System.out.println("2.print the list of employee details");
        System.out.println("3.update employee details");
        System.out.println("4.delete employee details");
        System.out.println("5.go to employee details");
    }

    private static void printInstructionsforproject() {
        System.out.println("6.create project");
        System.out.println("7.list project details");
        System.out.println("8.update project details");
        System.out.println("9.delete project details");
    }



    public static void createProject() {
        System.out.println("enter project details");
        System.out.println("enter project name");
        String projectname = sc.next();
        System.out.println("enter project id");
        int projectid = sc.nextInt();
        System.out.println("enter project modulenumber ");
        int projectmodule = sc.nextInt();
        projectcontroller.createProject(projectname, projectid, projectmodule);
    }
    public static void listProject(){
        projectcontroller.listProject();
    }
    public static void deleteProject() {
        System.out.println("enter project id");
        int deleteid = sc.nextInt();
        projectcontroller.deleteProject(deleteid);
    }
    public static void updateProject() {
        System.out.println("enter updated projectid details");
        int updateid = sc.nextInt();
        projectcontroller.updateProject(updateid);
    }
  // EmployeeController.sortEmployeeById();

}





