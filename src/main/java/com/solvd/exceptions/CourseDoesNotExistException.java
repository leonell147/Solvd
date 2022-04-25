package com.solvd.exceptions;

public class CourseDoesNotExistException extends Exception{
    public CourseDoesNotExistException() {
        super("The course does not exists");
    }
}
