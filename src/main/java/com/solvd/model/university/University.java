package com.solvd.model.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private ArrayList<Department> departments;

    private List<Report> reports;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
        reports = new ArrayList<Report>();

    }

    public ArrayList<Department> getDepartaments() {
        return departments;
    }

    public void addDepartaments(ArrayList<Department> department) {
        this.departments.addAll(department);
    }

    public void addDepartament(Department department) {
        this.departments.add(department);
    }

    public void addReport(Report report){

    }

}
