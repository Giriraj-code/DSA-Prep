package Easy.LINKEDLIST;
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ListCounter{



    public static int countNodes(Node head) {
    int count = 0;
    Node current = head;
    
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}



    public static void main(String[] args){
    Node n1 = new Node(20);
    Node n2 = new Node(30);
    Node n3 = new Node(40);
    Node n4 = new Node(50);
    Node head = n1;

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    int result = countNodes(head);
    System.out.println(result);

}
}












