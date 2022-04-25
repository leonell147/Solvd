package com.solvd.model.person;

import com.solvd.exceptions.SalaryZeroException;
import com.solvd.model.person.Person;
import org.apache.logging.log4j.Logger;

public abstract  class Employee extends Person {
    private int salary;

    private Logger log;
    public Employee(int age, String name, float height, float weight, int salary) {
        super(age, name, height, weight);
        try{
            setSalary(salary);}
        catch (SalaryZeroException e){
            log.error(e);
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws SalaryZeroException {
        if (salary == 0) {
            throw new SalaryZeroException("The salary can't be zero");
        }
        this.salary = salary;
    }
}
