package com.solvd.interfaces;
@FunctionalInterface
public interface IContact<S,M,R>{
    public void contact(S sender, M message, R receiver);
}
