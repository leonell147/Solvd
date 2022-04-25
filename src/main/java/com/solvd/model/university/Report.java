package com.solvd.model.university;

import com.solvd.model.person.Person;

import java.time.LocalDate;

public class Report<T extends Person>{
    private String description;
    private T owner;
    private LocalDate date;

    public Report(String description, T owner) {
        this.description = description;
        this.date = LocalDate.now();
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getOwner() {
        return owner;
    }

    public void setOwner(T owner) {
        this.owner = owner;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
