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
        System.out.println();

        System.out.println("Viewing the Top and Popping elements of Stack : ");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.push(70);
        linkedList2.push(30);
        linkedList2.push(56);
        linkedList2.display();
        System.out.println("Top of Stack : ");
        System.out.println(linkedList2.peek());
        System.out.println("After Popping Top of Stack : ");
        linkedList2.pop();
        linkedList2.display();
        System.out.println("Top of Stack : ");
        System.out.println(linkedList2.peek());
        System.out.println("After Popping Top of Stack : ");
        linkedList2.pop();
        linkedList2.display();
        System.out.println("Top of Stack : ");
        System.out.println(linkedList2.peek());
        System.out.println("After Popping Top of Stack : ");
        linkedList2.pop();
        linkedList2.display();

    }
}
