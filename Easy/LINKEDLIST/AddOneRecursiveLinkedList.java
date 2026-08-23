package Easy.LINKEDLIST;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddOneRecursiveLinkedList {

    // Recursive function to add 1
    public static int Helper(Node temp) {

        // End of list
        if (temp == null) {
            return 1;
        }

        // Go to last node
        int carry = Helper(temp.next);

        // Add carry
        temp.data = temp.data + carry;

        // No carry
        if (temp.data < 10) {
            return 0;
        }

        // Carry generated
        temp.data = 0;
        return 1;
    }

    public static Node AddOne(Node head) {

        int carry = Helper(head);

        // If carry is still 1,
        // we need a new node at beginning
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    // Print Linked List
    public static void Print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(9);

        head = AddOne(head);

        Print(head);
    }
}
