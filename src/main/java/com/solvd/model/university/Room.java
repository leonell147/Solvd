package com.solvd.model.university;

import com.solvd.enums.RoomCapacities;
import com.solvd.model.person.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private RoomCapacities capacity;
    private String name;
    private List<Reservation> reserves;

    private Logger log= LogManager.getLogger(Room.class);

    public Room(String name, RoomCapacities capacity) {
        this.name = name;
        this.capacity = capacity;
        this.reserves = new ArrayList<>();
    }
    public boolean itsAutorized(Person p){
        return true;
    }

    public void addReserve(Reservation r){
        this.reserves.add(r);
    }
    public RoomCapacities getCapacity() {
        return capacity;
    }

    public void setCapacity(RoomCapacities capacity) {
        this.capacity = capacity;
    }

    public void showReserves(){
        log.info(reserves.size());
    }
}
