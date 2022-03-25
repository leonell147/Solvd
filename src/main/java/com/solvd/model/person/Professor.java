package com.solvd.model.person;

import com.solvd.exceptions.SalaryZeroException;
import com.solvd.model.university.Subject;

import java.util.ArrayList;

public class Professor extends Employee {
    private ArrayList<Subject> subjects;

    public Professor(int age, String name, float height, float weight, int salary) throws SalaryZeroException {
            super(age, name, height, weight, salary);

    }
    public void addSubjects(ArrayList<Subject> subjects){
        subjects.addAll(subjects);
    }


}
