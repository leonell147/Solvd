package com.solvd.model.university;

import com.solvd.exceptions.ReservationDeniedException;
import com.solvd.model.person.Person;

import java.util.Date;

public class Reservation {
    private Date date;
    private Room room;
    private Person person;

    public Reservation(Date date, Room room, Person person) throws ReservationDeniedException {
        this.date = date;
        if (room.getClass().getSimpleName().equals("ExclusiveRoom") && !person.getClass().getSimpleName().equals("Professor"))
        {
            throw new ReservationDeniedException("This room is exclusively for professors");
        }
        this.room = room;
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

}
