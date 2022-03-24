package com.solvd;

public class Administrator extends Employee {
    private String area;

    public Administrator(int age, String name, float height, float weight, int salary, String area) {
        super(age, name, height, weight, salary);
        this.area= area;
    }
}
