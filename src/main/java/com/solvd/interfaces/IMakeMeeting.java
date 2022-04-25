package com.solvd.interfaces;

import com.solvd.model.person.Person;
import com.solvd.model.university.Department;
import com.solvd.model.university.Room;

public interface IMakeMeeting{
    public void makeMeeting(Room r, String description, Person organizer, Department department);
}
