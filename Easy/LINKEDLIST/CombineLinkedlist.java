package Easy.LINKEDLIST;


class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class Main{

    private static Node HeadDelete(Node head){

        if(head == null || head.next == null){
            return null;
        }

        return head.next;

        //OR This

        // Node temp = head;
        
        // temp = temp.next;
        // head = temp;

        // return head;


    }

    private static Node TailDelete(Node head){

         if(head == null || head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    private static Node KthElementDelete(Node head, int k){

         if(head == null){
            return null;
        }

        if(k == 1){
            return head.next;
        }

        Node temp = head;
        Node prev = null;
        int count = 0;

        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
        
    }

    private static void Printer(Node head){
        Node current = head;

        while(current != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        
    }

    public static void main(String[] args){
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

       Node HeadDelete =  HeadDelete(head);
       Node Tail = TailDelete(head);
       Node Kth = KthElementDelete(head,3);
        System.out.println("Tail Delete output");
        Printer(Tail);
        System.out.println("Head Delete output");
        Printer(HeadDelete);
        System.out.println("Kth Element Delete output");
        while(Kth != null){
            System.out.println(Kth.data);
            Kth = Kth.next;
        }

    }
}