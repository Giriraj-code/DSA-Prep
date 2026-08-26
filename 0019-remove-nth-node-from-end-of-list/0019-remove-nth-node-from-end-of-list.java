/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }

     

        ListNode temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
           
        if(n == count){
            return head.next;
        }
        ListNode temp2 = head;
        int res = count-n-1;
        while(res > 0){
            temp2 = temp2.next;
            res--;
        }
        temp2.next = temp2.next.next;

        return head;

    }
}