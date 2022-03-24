package com.solvd;

public class Room {
    private boolean reserved;
    private int capacity;

    public Room(int capacity) {
        this.reserved = false;
        this.capacity = capacity;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
