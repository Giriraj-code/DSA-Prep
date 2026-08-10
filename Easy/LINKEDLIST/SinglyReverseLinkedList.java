package Easy.LINKEDLIST;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
 class SinglyReverseLinkedList{
    public static Node ReverseLinkedList(Node head){
        Node current = head;
        Node prev = null;
        while(current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      Node n4 = new Node(4);

      Node head = n1;

        n1.next= n2;
        n2.next= n3;
        n3.next= n4;


      Node res = ReverseLinkedList(head);
      while(res!=null){
        System.out.println(res.data);
        res = res.next;
      }

    }
}
