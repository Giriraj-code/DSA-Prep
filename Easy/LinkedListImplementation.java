package Easy;

class Node{
    int data;
    Node next;

     Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class LinkedListImplementation {

    public static void Printer(Node head){
        Node current = head;
        while(current != null){
            System.out.println(current.data+ " ");
            current = current.next;
        }
    }
    public static void main(String[] args){
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        Node head = firstNode;


        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        Printer(head);

    }
}
