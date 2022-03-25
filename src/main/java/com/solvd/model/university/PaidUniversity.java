package com.solvd.model.university;

import com.solvd.exceptions.PaymentZeroException;

public class PaidUniversity extends University {
    private int payment;

    public PaidUniversity(String name, int payment) throws PaymentZeroException {
        super(name);
        setPayment(payment);
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) throws PaymentZeroException {
        if(payment==0){
            throw new PaymentZeroException("The payment can't be zero");
        }
        this.payment = payment;
    }
}
