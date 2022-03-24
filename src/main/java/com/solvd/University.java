package com.solvd;

import java.util.ArrayList;
import java.util.LinkedList;

public class University {
    private String name;
    private ArrayList<Departament> departaments;
    private LinkedList<Employee> employees;
    private LinkedList<Student> students;

    public University(String name) {
        this.name = name;
    }

    public ArrayList<Departament> getDepartaments() {
        return departaments;
    }

    public void addDepartaments(ArrayList<Departament> departaments) {
        this.departaments.addAll(departaments);
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(LinkedList<Employee> employees) {
        this.employees.addAll(employees);
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void addStudents(LinkedList<Student> students) {
        this.students.addAll(students);
    }
}
