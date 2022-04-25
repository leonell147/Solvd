package com.solvd.model.university;

import com.solvd.model.person.Student;

import java.util.LinkedList;

public class Course {
    private String name;
    private LinkedList<Student> students;
    private Subject subject;

    public Course(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public LinkedList getStudents() {
        return (LinkedList<Student>) students.clone();
    }

    public Subject getSubject() {
        return this.subject;
    }

    public String getName() {
        return this.name;
    }


    public boolean equals(Course obj) {
        return (this.name.equals(obj.name) && this.students.size() == obj.students.size() && this.subject.equals(obj.subject));
    }
}
