package com.solvd.model.university;

import java.util.ArrayList;

public class Degree {
    private String name;
    private Department department;
    private ArrayList<Subject> subjects;

    public Degree(String name, Department department){
        this.name= name;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartament(Department department) {
        this.department = department;
    }

    public void addSubjects(ArrayList<Subject> subject) {
        this.subjects.addAll(subject);
    }

    public Department getDepartament() {
        return department;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}
