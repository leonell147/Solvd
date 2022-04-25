package com.solvd.model.person;

import com.solvd.exceptions.SalaryZeroException;
import com.solvd.model.university.Room;
import com.solvd.model.university.Subject;

public class Auxiliar extends Employee {
    public Auxiliar(int age, String name, float height, float weight, int salary) throws SalaryZeroException {
        super(age, name, height, weight, salary);
    }
    public void cleanTheRoom(Room r){}
}
