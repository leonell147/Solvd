package com.solvd.exceptions;

public class ReservationDeniedException extends Exception{
    public ReservationDeniedException() {}

    public ReservationDeniedException(String message){
        super(message);
    }

}
