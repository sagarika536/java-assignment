package com.java.training.repository;

import com.java.training.model.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {
    List<Project> projectlist=new ArrayList<>();
    public void saveProject(Project project){
        projectlist.add(project);
    }
    public List<Project> listProject() {
    return projectlist;
    }
}
