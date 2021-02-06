package com.java.training.model;

public class Project {
    private String projectname;
    private int projectid;
    private int projectmodule;

    public Project(String projectname, int projectid, int projectmodule) {
        this.projectname = projectname;
        this.projectid = projectid;
        this.projectmodule = projectmodule;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public void setProjectmodule(int projectmodule) {
        this.projectmodule = projectmodule;
    }

    public String getProjectname() {
        return projectname;
    }

    public int getProjectid() {
        return projectid;
    }

    public int getProjectmodule() {
        return projectmodule;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectname='" + projectname + '\'' +
                ", projectid=" + projectid +
                ", projectmodule=" + projectmodule +
                '}';
    }
}
