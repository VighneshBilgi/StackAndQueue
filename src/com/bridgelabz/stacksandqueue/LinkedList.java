package com.bridgelabz.stacksandqueue;

public class LinkedList<E> {
    Node<E> top;
    Node<E> head;
    Node<E> tail;

    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        if(top == null){
            top = newNode;

        }else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void displayStack(){

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

    public void enqueue(E data) {
        Node<E> newNode=new Node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayQueue() {
        Node<E> temp = head;

        if(head==null){
            System.out.println("Queue is empty");
        }

        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public void dequeue() {
        E data = head.data;
        head = head.next;
    }

}
