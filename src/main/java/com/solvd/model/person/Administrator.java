package com.solvd.model.person;

import com.solvd.exceptions.CourseDoesNotExistException;
import com.solvd.interfaces.IContact;
import com.solvd.interfaces.IDelete;
import com.solvd.interfaces.IReport;
import com.solvd.interfaces.IReserve;
import com.solvd.model.university.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Administrator extends Employee implements IDelete {

    private Logger log = LogManager.getLogger(Administrator.class);
    private University university;

    public Administrator(int age, String name, float height, float weight, int salary, University area)  {
        super(age, name, height, weight, salary);
        this.university= area;
    }
    public void createCourse(Department department, String courseName, Subject subject){
        department.addCourse(new Course(courseName, subject));
    }

    public void addCourse(Student s, Department d, String courseName) {

        try {
            s.addCurrentCourse(d.getCourse(courseName));
        } catch (CourseDoesNotExistException e) {
            log.error("The deparament"+d+" hasn't one curse with name "+courseName,e);
        }
    }
    public void addCourse(Professor professor, Department department, String courseName) {
        try {
            professor.addCourse(department.getCourse(courseName));
        } catch (CourseDoesNotExistException e) {
            log.error("The deparament"+ department +" hasn't one curse with name "+courseName,e);
        }
    }
    public void generateReport(String name, IReport<University> i) {
        i.generateReport(name,university,this);
    }


    public void reserveRoom(Professor p, Room r, IReserve i) {
        i.reserveRoom(p,r);
    }


    public void delete() {

    }

    public void contact(Student s, String message, Professor p, IContact<Student, String, Professor> i) {
        i.contact(s, message, p);
    }
}
