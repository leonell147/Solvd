package com.solvd.model.person;

import com.solvd.exceptions.SalaryZeroException;

public class Administrator extends Employee {
    private String area;

    public Administrator(int age, String name, float height, float weight, int salary, String area) throws SalaryZeroException {
        super(age, name, height, weight, salary);
        this.area= area;
    }
}
