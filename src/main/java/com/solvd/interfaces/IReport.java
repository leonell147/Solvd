package com.solvd.interfaces;

import com.solvd.model.person.Person;

@FunctionalInterface
public interface IReport <D>{
    public void generateReport(String name,D destiny, Person emitter);
}
