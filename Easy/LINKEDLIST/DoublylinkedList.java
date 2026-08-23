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

class DoublylinkedList{

    public static Node DLL(int[] arr){
        Node head = new Node(arr[0]);

        Node prev = head;

        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = prev.next;
        }
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
        int[] arr = {1,2,3,4,5,6};
        Node res = DLL(arr);
        Printer(res);
    }
} 
