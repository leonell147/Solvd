package com.solvd.exceptions;

public class CapacityExceededException extends Exception{
    public CapacityExceededException(){}

    public CapacityExceededException(String message){
        super(message);
    }
}
