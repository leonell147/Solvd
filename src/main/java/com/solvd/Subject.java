package com.solvd;

import java.util.ArrayList;

public class Subject {
    private Degree degree;
    private String name;
    private ArrayList<Subject> correlative;
    private ArrayList<String> topics;

    public Subject(Degree degree, String name) {
        this.degree = degree;
        this.name= name;
    }

    public ArrayList<Subject> getCorrelative() {
        return correlative;
    }

    public void setCorrelative(ArrayList<Subject> correlative) {
        this.correlative = correlative;
    }

    public ArrayList<String> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }
    public void addTopics(ArrayList<String> topics){
        this.topics.addAll(topics);
    }

    @Override
    public String toString() {
        return name + " from: "+ degree.toString();
    }

    @Override
    public int hashCode() {
        return degree.hashCode()*name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj== null || getClass() != obj.getClass()) return false;
        Subject subject= (Subject) obj;
        return (this.hashCode()==subject.hashCode() && this.correlative.size()==subject.correlative.size());
    }
}
