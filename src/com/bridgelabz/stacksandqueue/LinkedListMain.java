package com.bridgelabz.stacksandqueue;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Printing elements of Stack : ");
        linkedList.display();

    }
}
