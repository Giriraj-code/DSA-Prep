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

public class Add2NumInLinkedList {

    public static Node Added(Node head1, Node head2){
      if(head1 == null && head2 == null){
        return null;
      }
      Node temp1 = head1;
      Node temp2 = head2;
      Node dummyHead = new Node(-1);
      Node current = dummyHead;
      int carry = 0;

      while(temp1 != null || temp2 != null){
        int sum = carry;

        if(temp1 != null){
          sum += temp1.data;
        }

        if(temp2 != null){
          sum += temp2.data;
        }

        Node newNode = new Node(sum % 10);
        carry = sum / 10;

        current.next = newNode;
        current = current.next;

        if(temp1 != null){
          temp1 = temp1.next;
        }

        if(temp2 != null){
          temp2 = temp2.next;
        }

      }
      if(carry != 0){
        current.next = new Node(carry);
      }

      return dummyHead.next;
    }

    public static void main(String[] args) {
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);
      Node head1 = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;

      Node t1 = new Node(5);
      Node t2 = new Node(6);
      Node t3 = new Node(7);
      Node t4 = new Node(8);
      Node head2 = t1;
      t1.next = t2;
      t2.next = t3;
      t3.next = t4;
  
      Node res = Added(head1,head2);
      while(res != null){
        System.out.print(res.data);
        res = res.next;
      }

      
      
    }
}
