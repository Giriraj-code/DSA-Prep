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
public class OddEvenByNodeLinkedList {

    public static Node Answer(Node head){
      Node temp = head;
      Node oddHead = null;
      Node oddTail = null;
      Node evenHead = null;
      Node evenTail = null;
      int position = 1;
      while(temp != null){
        if(position % 2 != 0){
          if(oddHead == null){
             oddHead = temp;
             oddTail = temp;
          }else{
                 oddTail.next = temp;
                 oddTail = temp;
          }
        }else{
            if(evenHead == null){
               evenHead = temp;
               evenTail = temp;
            }else{
                evenTail.next = temp;
                evenTail = temp;
            }
        }
        position++;
        temp = temp.next;
      }
       if(evenHead != null){
              oddTail.next = evenHead;
            }
      return oddHead;
    }

    public static void main(String[] args) {
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);
      Node n5 = new Node(5);
      Node n6 = new Node(6);
      Node head = n1;

      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      n5.next = n6;
      Node res = Answer(head);
      while(res != null){
        System.out.println(res.data);
        res = res.next;
      }
    }
}
