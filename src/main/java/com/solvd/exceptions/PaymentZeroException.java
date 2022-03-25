package com.solvd.exceptions;

public class PaymentZeroException extends Exception{
    public PaymentZeroException(){}
    public PaymentZeroException(String error){super(error);}
}
