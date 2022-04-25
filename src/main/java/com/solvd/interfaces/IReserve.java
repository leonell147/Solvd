package com.solvd.interfaces;

import com.solvd.model.person.Professor;
import com.solvd.model.university.Room;
@FunctionalInterface
public interface IReserve {

    public void reserveRoom(Professor p, Room r);
}
