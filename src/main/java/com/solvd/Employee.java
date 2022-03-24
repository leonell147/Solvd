package com.solvd;

public class Employee extends Person{
    private int salary;


    public Employee(int age, String name, float height, float weight, int salary) {
        super(age, name, height, weight);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
