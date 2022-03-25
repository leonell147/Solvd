package com.solvd.model.university;

import com.solvd.model.person.Employee;
import com.solvd.model.person.Student;
import com.solvd.model.university.Departament;

import java.util.ArrayList;
import java.util.LinkedList;

public class University {
    private String name;
    private ArrayList<Departament> departaments;
    private LinkedList<Employee> employees;
    private LinkedList<Student> students;

    public University(String name) {
        this.name = name;
        departaments=new ArrayList<Departament>();
        employees= new LinkedList<Employee>();
        students= new LinkedList<Student>();
    }

    public ArrayList<Departament> getDepartaments() {
        return departaments;
    }

    public void addDepartaments(ArrayList<Departament> departament) {
        this.departaments.addAll(departament);
    }
    public void addDepartaments(Departament departament) {
        this.departaments.add(departament);
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
