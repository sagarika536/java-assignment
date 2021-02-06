package com.java.training.Controller;

import com.java.training.Service.ProjectService;
import com.java.training.model.Employee;

public class ProjectController {
    ProjectService projectService=new ProjectService();
    public void createProject(String projectname,int projectid,int projectmodule){
        projectService.createProject(projectname,projectid,projectmodule);
        }
        public void listProject(){
        projectService.listProject();
    }

    public void deleteProject(int deleteid) {
        projectService.deleteProject(deleteid);
    }
    public void updateProject(int updateid){
        projectService.updateProject(updateid);
    }
}
