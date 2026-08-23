package Easy.LINKEDLIST;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data, Node head, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = back;
    }
}

class DoublyLinkedListDelete{

    // public static Node DLL(int[] arr){
    //     Node head = new Node(arr[0]);

    //     Node prev = head;

    //     for(int i = 1; i<arr.length; i++){
    //         Node temp = new Node(arr[i],null,prev);
    //         prev.next = temp;
    //         prev = prev.next;
    //     }
    //     return head;
    // }

    public static Node DeleteElement(Node head){
        if(head == null || head.next == null){
            return null;
        }

          Node prev = head;
            head = head.next;
            head.back = null;
            prev.next = null;
        return head;
    }

    public static void Printer(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,6};
         Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        Node head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node res = DeleteElement(head);
        Printer(res);
    }
} 
