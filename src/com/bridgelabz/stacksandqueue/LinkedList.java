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
}
