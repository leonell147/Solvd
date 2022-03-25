package com.solvd.model.person;

import com.solvd.exceptions.SalaryZeroException;
import com.solvd.model.person.Person;

public class Employee extends Person {
    private int salary;


    public Employee(int age, String name, float height, float weight, int salary) throws SalaryZeroException {
        super(age, name, height, weight);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary)throws SalaryZeroException {
        if(salary==0){
            throw new SalaryZeroException("The salary can't be zero");
        }
        this.salary = salary;
    }
}
