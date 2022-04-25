package com.solvd.model.university;

import com.solvd.model.person.Person;

public class Message<S extends Person, R extends Person> {
    S sender;

    R receiver;
    String message;

    public Message(S sender, R receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public S getSender() {
        return sender;
    }

    public void setSender(S sender) {
        this.sender = sender;
    }

    public R getReceiver() {
        return receiver;
    }

    public void setReceiver(R receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
