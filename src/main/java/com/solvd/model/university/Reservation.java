package com.solvd.model.university;

import com.solvd.exceptions.ReservationDeniedException;
import com.solvd.model.person.Person;
import com.solvd.model.person.Professor;

import java.util.Date;

public class Reservation {
    private Date start;

    private Date end;
    private Professor professor;

    public Reservation(Date start, Date end, Professor professor) {
        this.start = start;
        this.end = end;
        this.professor = professor;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String toString(){
        return "Reserved by "+ professor.getName();
    }
}
