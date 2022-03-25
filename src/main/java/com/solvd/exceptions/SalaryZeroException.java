package com.solvd.exceptions;

public class SalaryZeroException extends Exception{
    public SalaryZeroException(){}
    public SalaryZeroException(String error){super(error);}
}
