package Easy.LINKEDLIST;


class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}
 class ZerosOnesTowsSolutionSecond {

    public static Node Answer(Node head){
      if(head == null || head.next == null){
        return head;
      }
      Node temp = head;
      int countZeros = 0;
      int countOnes = 0;
      int countTwos = 0;
      while(temp!=null){
        if(temp.data == 0){
          countZeros++;
        }else if(temp.data == 1){
          countOnes++;
        }else{
          countTwos++;
        }
        temp = temp.next;
      }
      temp = head;
      while(temp!=null){
        if(countZeros > 0){
          temp.data = 0;
          countZeros--;
        }else if(countOnes > 0){
          temp.data = 1;
          countOnes--;
        }else{
          temp.data = 2;
          countTwos--;
        }
        temp = temp.next;
      }
      return head;
  
    }

    public static void Printer(Node head){
      Node temp = head;
      while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
      }
    }

    public static void main(String[] args) {
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(0);
      Node n4 = new Node(1);
      Node n5 = new Node(2);
      Node head = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      Node res = Answer(head);
      Printer(res);
    }

    
}
