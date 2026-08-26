package Easy.LINKEDLIST;


class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class InsertionAtYPointLinkedList {

    public static Node Answer(Node headA, Node headB){
      if(headA == null || headB == null){
        return null;
      }
      Node tempA = headA;
      Node tempB = headB;

      while(tempA != tempB){
        if(tempA == null){
          tempA = headB;
        }else{
          tempA = tempA.next;
        }
        if(tempB == null){
          tempB = headA;
        }else{
          tempB = tempB.next;
        }
      }
      return tempA;
    }

    public static void main(String[] args) {
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);
      Node n5 = new Node(5);
      Node headA = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;

      Node t1 = new Node(5);
      Node t2 = new Node(6);
      Node t3 = new Node(7);
      Node t4 = new Node(8);
      Node t5 = new Node(9);
      Node t6 = new Node(10);
      Node t7 = new Node(11);
      Node headB = t1;
      t1.next = t2;
      t2.next = t3;
      t3.next = t4;
      t4.next = t5;
      t5.next = t6;
      t6.next = t7;
      t7.next = n3;

      Node res = Answer(headA,headB);
      while(res != null){
        System.out.println(res.data);
        res = res.next;
      }

    }
}
