package Easy.LINKEDLIST;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ArrayToLinkedList {

    private static Node ArrayToLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;

    }

    public static Node Printer(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 8, 10 };
        Node head = ArrayToLL(arr);
        Node ans = Printer(head);
        System.out.println(ans);
    }
}
