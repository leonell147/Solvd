package com.solvd;

import java.util.LinkedList;

public class ExclusiveRoom extends Room{
    private LinkedList<Departament> exclusivity;


    public ExclusiveRoom(int capacity) {
        super(capacity);
    }

    public void addExclusivity(LinkedList<Departament> exclusivity) {
        this.exclusivity.addAll(exclusivity);
    }

    public LinkedList<Departament> getExclusivity() {
        return exclusivity;
    }
}
