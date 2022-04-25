package com.solvd.model.university;

import com.solvd.enums.RoomCapacities;

public class ExclusiveRoom extends Room {
    private Department exclusivity;

    public ExclusiveRoom(String name, RoomCapacities capacity, Department exclusivity) {
        super(name, capacity);
        this.exclusivity = exclusivity;
    }


}
