package com.bridgelabz.stacksandqueue;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Printing elements of Stack : ");
        linkedList.displayStack();
        System.out.println();

        System.out.println("Viewing the Top and Popping elements of Stack : ");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.push(70);
        linkedList2.push(30);
        linkedList2.push(56);
        linkedList2.displayStack();
        System.out.println("Top of Stack : ");
        System.out.println(linkedList2.peek());
        System.out.println("After Popping Top of Stack : ");
        linkedList2.pop();
        linkedList2.displayStack();
        System.out.println("Top of Stack : ");
        System.out.println(linkedList2.peek());
        System.out.println("After Popping Top of Stack : ");
        linkedList2.pop();
        linkedList2.displayStack();
        System.out.println("Top of Stack : ");
        System.out.println(linkedList2.peek());
        System.out.println("After Popping Top of Stack : ");
        linkedList2.pop();
        linkedList2.displayStack();

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.enqueue(56);
        linkedList3.enqueue(30);
        linkedList3.enqueue(70);
        System.out.println("Printing elements of Queue : ");
        linkedList3.displayQueue();
        System.out.println();

        System.out.println("Viewing de-queueing elements of Queue : ");
        LinkedList<Integer> linkedList4 = new LinkedList<>();
        linkedList4.enqueue(56);
        linkedList4.enqueue(30);
        linkedList4.enqueue(70);
        linkedList4.displayQueue();
        System.out.println("After de-queueing Head of Queue : ");
        linkedList4.dequeue();
        linkedList4.displayQueue();
        System.out.println("After de-queueing Head of Queue : ");
        linkedList4.dequeue();
        linkedList4.displayQueue();
        System.out.println("After de-queueing Head of Queue : ");
        linkedList4.dequeue();
        linkedList4.displayQueue();

    }
}
