package Easy.LINKEDLIST;

import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class BasicLinkedListStructure {

  public static int DoublyLength(Node head){
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    return count;
  }
  
  public static Node DoublyFindKthNode(Node head, int k){
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      if(count == k){
        break;
      }
      temp = temp.next;
    }
    return temp;
  }

  public static Node DoublySearch(Node head, int val){
    Node temp = head;
    while(temp != null){
      if(temp.data == val){
        break;
       }
      temp = temp.next;
    }
    return temp;
  }

  public static Node DoublyDeleteKth(Node head, int k){
    if(k == 1){
      head = head.next;
      return head;
    }
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      if(count == k -1){
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
    return head;
  }

  public static Node DoublyInsertNode(Node head, int k, int val){
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      if(count == k-1){
        Node newNode = new Node(val);
        Node front = temp.next;
        temp.next = newNode;
        newNode.prev = temp;

        newNode.next = front;
        if(front != null){
          front.prev = newNode;
        }
        break;
      }
      temp = temp.next;
    }
    return head;
  }

  public static Node DoublyFindKthTail(Node head, int k){
    
    Node temp = head;
    int count = 1;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    int res = count-k;
    temp = head;
    count = 0;
    while(temp != null){
      count++;
      if(count == res){
        break;
      }
      temp = temp.next;
    }
    return temp;
  }

  public static Node Printer(Node head,int k){
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    return head;
  }

  public static void main (String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    Node head = n1;
    n1.next = n2;
    n2.prev = n1;

    n2.next = n3;
    n3.prev = n2;

    n3.next = n4;
    n4.prev = n3;

    n4.next = n5;
    n5.prev = n5;

    Node res = DoublyFindKthTail(head,4);
    System.out.print(res.data);

    // Printer(res,1);

    // int res = DoublyLength(head);
    // System.out.println(res);
  }
}
