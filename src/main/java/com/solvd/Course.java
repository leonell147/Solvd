package com.solvd;

import java.util.LinkedList;

public class Course {
    private String id;
    private LinkedList<Student> students;
    private Subject subject;

    public Course(String id, Subject subject){
        this.id=id;
        this.subject=subject;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public LinkedList getStudents(){
        return (LinkedList<Student>) students.clone();
    }
    public Subject getSubject(){return this.subject;}

    public String getId(){return this.id;}


    public boolean equals(Course obj) {
        return (this.id.equals(obj.id)&& this.students.size()==obj.students.size()&& this.subject.equals(obj.subject));
    }
}
