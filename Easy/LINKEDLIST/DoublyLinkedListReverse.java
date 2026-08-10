package Easy.LINKEDLIST;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
}
class DoublyLinkedListReverse{

    public static Node DllReverse(Node head){
        Node current = head;
        Node newNode = null;
        while(current!=null){
            Node temp = current.back;
            current.back = current.next;
            current.next = temp;
            newNode = current;
            current = current.back;
        }
        return newNode;
    }

    public static void main (String[] args) {
    Node n1 = new Node(5);
    Node n2 = new Node(4);
    Node n3 = new Node(3);
    Node n4 = new Node(2);
    Node n5 = new Node(1);

    Node head = n1;

    n1.next = n2;
    n2.back = n1;

    n2.next = n3;
    n3.back = n2;


    n3.next = n4;
    n4.back = n3;

    n4.next = n5;
    n5.back = n4;

    Node res = DllReverse(head);
    while(res!=null){
        System.out.println(res.data);
        res = res.next;
    }
    }
}