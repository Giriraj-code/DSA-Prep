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

class CombineLinedList2{

    public static Node HeadDelete(Node head){
        if(head == null  || head.next == null){
            return null;
        }
        
        Node temp = head;
        head = head.next;
        head.back = null;
        temp.next = null;
        return head;
    }

    public static Node TailDelete(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.back;
        prev.next = null;
        temp.back = null;
        return head;
    }


    public static Node KthElementDelete(Node head , int k){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        if(k == 1){
            return  HeadDelete(head);
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count ++;
            if(count == k){
                Node prev = temp.back;
                Node front = temp.next;
                if(front == null){
                    prev.next = null;
                    temp.back = null;
                    return head;
                }
                prev.next = front;
                front.back = prev;
                temp.next = null;
                temp.back = null;
            }
            temp = temp.next;
        }
        return head;
    }
    

    public static Node ConvertNodeToArray(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            temp.back = prev;
            prev = temp;
        }
        return head;
    }

    public static Node DeleteValue(Node head, int val){
        if(head == null){
            return null;
        }
        if(head.data == val){
            return HeadDelete(head);
        }

        if(head.data != val){
            return head;
        }
        
        Node temp = head;
        while(temp!=null){
            if(temp.data == val){
                Node prev = temp.back;
                Node front = temp.next;
                if(front == null){
                    prev.next = null;
                    temp.back = null;
                    return head;
                }
                prev.next = front;
                front.back = prev;
                temp.next = null;
                temp.back = null;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node InsertAtHead(Node head, int val){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        Node temp = head;
        Node newNode = new Node(val);
       newNode.next = temp;
        head.back = newNode;
        newNode.back = null;
        return newNode;
    }

    public static Node InsertAtTail(Node head, int val) {

    Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    Node newNode = new Node(val);

    temp.next = newNode;
    newNode.back = temp;

    return head;
}

    public static Node InsertElement(Node head, int val, int k){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        

        Node temp = head;
        int count = 0;
        if(count == k || head.next == null){
            return InsertAtHead(head,val);
        }
        while(temp!= null){
                count++;
            if(count == k){
                Node newNode = new Node(val);
                Node prev = temp.back;

                  if (temp.next == null) {
                return InsertAtTail(head, val);
            }
               prev.next = newNode;
               newNode.next = temp;
               temp.back = newNode;
               newNode.back = prev;
                
            }
            temp = temp.next;
        }
        return head;
    }
    
       public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,6};
           Node n1 = new Node(5);
           Node n2 = new Node(2);
           Node n3 = new Node(6);
           Node n4 = new Node(8);
           Node n5 = new Node(4);
           
           Node head = n1;

           n1.next = n2;
           n2.back = n1;
           
           n2.next = n3;
           n3.back = n2;
           
           n3.next = n4;
           n4.back = n3;
           
           n4.next = n5;
           n5.back = n4;
           
           
        // Node res =    KthElementDelete(head,5);
        Node res =  InsertElement(head,10,5);
            while(res!=null){
            System.out.println(res.data);
            res=res.next;
            }
    }
}


















