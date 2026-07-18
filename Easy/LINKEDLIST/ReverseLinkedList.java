package Easy.LINKEDLIST;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static Node Printer(Node head){

        if(head == null || head.next == null){
            return head;
        }

       Node prev = null;
       Node current = head;

        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(16);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node result = Printer(head);
        
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}