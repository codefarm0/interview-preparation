package com.codefarm.algo;

import java.util.Stack;

public class LinkedListReversal {
    public static void main(String[] args) {
        Node one = new Node(1, null);
        Node two = new Node(2, null);
        Node three = new Node(3, null);
        Node four = new Node(4, null);
        one.next = two;
        two.next=three;
        three.next=four;

        System.out.println("Initial List - " );
        printList(one);
        System.out.println("Reversed List - " );
//        Node reversedList = reverseListIterative(one);
        Node reversedList = reverseListRecursive(one);
//        Node reversedList = reverseListUsingStack(one);
        printList(reversedList);
    }

    static private Node reverseListIterative(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        return prev;
    }
    private static  Node reverseListRecursive(Node head){
        return reverseRecursive(head, null);
    }

    /**
     * reverseRecursive(1, null)
     * reverseRecursive(2, 1)
     * reverseRecursive(3, 2)
     * reverseRecursive(4, 3)
     * reverseRecursive(null, 4)
     */
    private static Node reverseRecursive(Node current, Node prev) {
        if (current == null) {
            return prev;
        }
        Node next = current.next;
        current.next = prev;
        return reverseRecursive(next, current);
    }

    private static Node reverseListUsingStack(Node head) {
        if (head == null) return null;

        Stack<Node> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        Node newHead = stack.pop();
        current = newHead;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null;

        return newHead;
    }
    
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
