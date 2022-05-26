package com.bridgelabz.stacksandqueue;

public class LinkedList<E> {
    Node<E> top;

    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        if(top == null){
            top = newNode;

        }else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void display(){

        Node<E> temp = top;

        if(top==null){
            System.out.println("Stack is empty");
        }

        while(temp!=null){
                System.out.println(" "+ temp.data);
                temp = temp.next;
            if(temp!=null) {
                System.out.println(" ^");
                System.out.println(" |");
            }
        }

        System.out.println();
    }

    public E peek() {

        return top.data;

    }

    public void pop() {
        E data = top.data;
        top = top.next;
    }

}
