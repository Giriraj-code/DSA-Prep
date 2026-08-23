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
public class AddOneLinkedList {

    public static Node Reverse(Node head){
      Node temp = head;
      Node prev = null;
      while(temp != null){
        Node next = temp.next;
        temp.next = prev;
        prev = temp;
        temp = next;
      }
      return prev;
    }

    public static Node Adder(Node head){
      head = Reverse(head);
      Node temp = head;
      int carry = 1;
      while(temp != null){
        temp.data = temp.data + carry;
        if(temp.data < 10){
          carry = 0;
          break;
        }else{
          temp.data = 0;
          carry = 1;
        }
      temp = temp.next;

      }
  
      if(carry == 1){
        Node newNode = new Node(1);
       head = Reverse(head);
        newNode.next = head;
        return newNode;
      }else{
       head = Reverse(head);
        return head;
      }
    }

    public static void main(String[] args) {
      Node n1 = new Node(9);
      Node n2 = new Node(9);
      Node n3 = new Node(9);
      Node n4 = new Node(9);
      Node n5 = new Node(9);
      Node head = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      Node res = Adder(head);
      while(res != null){
        System.out.println(res.data);
        res = res.next;
      }

    }
}
       