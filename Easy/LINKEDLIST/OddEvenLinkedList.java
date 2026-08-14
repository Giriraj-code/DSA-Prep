package Easy.LINKEDLIST;

import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class OddEvenLinkedList {

    public static Node Answer(Node head){
        Node temp = head;
        Node oddHead = null;
        Node oddTail = null;
        Node evenTail = null;
        Node evenHead = null;

        while(temp!=null){
            if(temp.data % 2 != 0){
                Node newOddNode = new Node(temp.data);
                
                if(oddHead == null){
                    oddHead = newOddNode;
                    oddTail = newOddNode;
                }else{
                    oddTail.next = newOddNode;
                    oddTail = newOddNode; // or oddTail = oddTail.next;
                }
            }else{
                Node newEvenNode = new Node(temp.data);

                if(evenHead == null){
                    evenHead = newEvenNode;
                    evenTail = newEvenNode;
                }else{
                    evenTail.next = newEvenNode;
                    evenTail = newEvenNode; // or evenTail = evenTail.next;
                }
            }
            temp = temp.next;
        }
        if(oddHead == null){
            return evenHead;
        }
        oddTail.next = evenHead;
        return oddHead;
    }

    public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n7 = new Node(7);
    Node head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;

    Node result = Answer(head);
    while(result != null){
        System.out.print(result.data);;
        result = result.next;
    }

    }
}