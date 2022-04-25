package com.solvd.model.person;

import com.solvd.enums.Days;
import com.solvd.interfaces.*;
import com.solvd.model.university.Course;
import com.solvd.model.university.Department;
import com.solvd.model.university.Room;
import com.solvd.model.university.Subject;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Employee implements IReserve {
    private ArrayList<Subject> subjects;
    private List<Course> assignedCurses;

    private List<Days> daysOfClasses;

    public Professor(int age, String name, float height, float weight, int salary) {
        super(age, name, height, weight, salary);
        subjects = new ArrayList<>();
        assignedCurses = new ArrayList<>();
        daysOfClasses = new ArrayList<>();
    }

    public void addSubjects(ArrayList<Subject> subjects) {
        subjects.addAll(subjects);
    }

    public void addCourse(Course course) {
        assignedCurses.add(course);
    }

    public void addDayOfClasses(Days days) {
        daysOfClasses.add(days);
    }


    public void makeMeeting(Room r, String description, Department dep, IMakeMeeting i) {
        i.makeMeeting(r, description,this,dep);
    }

    public void generateReport(String name, Department dep, IReport<Department> i) {
        i.generateReport(name,dep,this);
    }


    public void contact(Student s, String message, IContact<Student, String, Person> i) {
        i.contact(s, message, this);
    }

    @Override
    public void reserveRoom(Professor p, Room r) {

    }
}
