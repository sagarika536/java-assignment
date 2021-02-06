package com.java.training.Service;

import com.java.training.model.Employee;
import com.java.training.model.Project;
import com.java.training.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectService {
    ProjectRepository projectrepository = new ProjectRepository();
    Scanner sc=new Scanner(System.in);
    public void createProject(String projectname,int projectid,int projectmodule){
     Project project=new Project(projectname,projectid,projectmodule);
     project.setProjectid(projectid);
     project.setProjectname(projectname);
     project.setProjectmodule(projectmodule);
     projectrepository.saveProject(project);
    }
    List<Project> projectlist = projectrepository.listProject();
    public void listProject() {

        for (Project project : projectlist) {
            System.out.println(project);
        }
    }
    public void deleteProject(int deleteid) {
        for (Project project : projectlist)
            if(project.getProjectid()==deleteid)
                projectlist.remove(project);
    }

    public void updateProject(int updateid) {
        for (Project project : projectlist)
            if(project.getProjectid()==updateid){
                System.out.println("enter project name");
                String name = sc.next();
                System.out.println("enter project id");
                int id=sc.nextInt();
                System.out.println("enter project modulenumber");
                int modulenumber = sc.nextInt();
                project.setProjectname(name);
                project.setProjectid(id);
                project.setProjectmodule(modulenumber);
            }
    }
}



