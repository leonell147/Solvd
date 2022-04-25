package com.solvd.model.university;

import com.solvd.exceptions.CourseDoesNotExistException;
import com.solvd.model.person.Administrator;
import com.solvd.model.person.Person;
import com.solvd.model.person.Professor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;

    private Administrator administrator;

    private List<Professor> professors;
    private University university;

    private ArrayList<Course> courses;

    private List<Report> reports;

    private Logger log = LogManager.getLogger(Department.class);

    public Department(String name, Administrator administrator, ArrayList<Professor> professors, University university, ArrayList<Course> courses, ArrayList<Report> reports) {
        this.name = name;
        this.administrator = administrator;
        this.professors = professors;
        this.university = university;
        this.courses = courses;
        this.reports = reports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }
    public void addCourse(Course course){
        this.courses.add(course);
    }
    public Course getCourse(String name) throws CourseDoesNotExistException {
        for (Course course : courses) {
            if(course.getName().equals(name)) return course;
        }
        throw new CourseDoesNotExistException();
    }
    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }
    public void addMeeting(Room room, String desc, Person organizer){

    }

    public void addReport(Report report){
        reports.add(report);
    }

    public void showReports(){
        reports.forEach(M->log.info(M.getOwner() + M.getDescription()));
    }
}

