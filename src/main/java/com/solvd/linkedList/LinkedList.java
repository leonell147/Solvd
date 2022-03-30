package com.solvd.linkedList;

import java.util.AbstractList;
import java.util.Collection;

public class LinkedList<T> extends AbstractList<T> {
    private Node<T> head;
    private int size;

    private class Node<T>{
        private T value;
        private Node<T> next;

        public Node(){
            value=null;
            next= null;
        }
        public Node(T value){
            this.value= value;
            next=null;
        }
    }
    public LinkedList(){
        head= new Node<T>();
        size=0;
    }

    @Override
    public boolean add(T t) {
        Node<T> current=head;
        while(current.next!= null){
            current=current.next;
        }
        current.next= new Node<T>(t);
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if((index<0)||(index>size))throw new IndexOutOfBoundsException();
        if(index==0) {
            Node<T> aux= new Node<>(element);
            aux.next=head;
            head= aux;
        }
        else {
            Node<T> current=head;
            int count=0;
            while (count<index-1){
                current=current.next;
                count++;
            }
            Node<T> aux= current.next;
            current.next= new Node<T>(element);
            current.next.next=aux;
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for(T object : c){
            this.add(object);
        }
        return true;
    }

    @Override
    public T get(int index) {
        if((index<0)||(index>size))throw new IndexOutOfBoundsException();
        Node<T> current= head;
        int count=0;
        while (count<index){
            current=current.next;
            count++;
        }
        return current.value;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
}
