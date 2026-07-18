package Easy.LINKEDLIST;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListAddNode{
    public static void printer(Node head){
        Node current = head;

        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }

    }
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;

        Node newNode = new Node(5);

        newNode.next = head;
        head = newNode;

        printer(head);
        
    }
}