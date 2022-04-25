package com.solvd.model.person;

import com.solvd.enums.Days;
import com.solvd.interfaces.IMakeMeeting;
import com.solvd.interfaces.IReport;
import com.solvd.model.university.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private Degree degree;
    private ArrayList<Course> currentCourses;
    private ArrayList<Subject> approvedSubjects;

    private List<Days> daysWithClasses;

    private Logger log = LogManager.getLogger(Subject.class);

    private List<Message> messages;

    public Student(int age, String name, float height, float weight) {
        super(age, name, height, weight);
        currentCourses= new ArrayList<>();
        approvedSubjects = new ArrayList<>();
        messages = new ArrayList<>();

    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public ArrayList<Course> getCurrentCourses() {
        return currentCourses;
    }

    public ArrayList<Subject> getPassedSubjects(){return approvedSubjects;}

    public void addApprovedSubjects (ArrayList<Subject> passedSubjects){this.approvedSubjects.addAll(passedSubjects);}

    public void addCurrentCourse(Course course){
        currentCourses.add(course);
    }
    public boolean addMsj(Professor emitter, String message) {
        messages.add(new Message<Professor, Student>(emitter,this,message));
        return true;
    }
    public void showMessages() {

        messages.forEach(m -> log.info(m.getMessage()));
    }
    public void makeMeeting(Room r, String description, Department department, IMakeMeeting i) {
        i.makeMeeting(r, description,this,department);
    }
    public void generateReport(String name, Department dep, IReport<Department> i) {
        i.generateReport(name,dep,this);
    }
}
