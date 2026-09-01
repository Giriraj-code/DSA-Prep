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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int length = 0;

        while(temp != null){
            length++;
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }

        k = k % length;
        
        if(k == 0){
            return head;
        }

        temp.next = head;
        int count = 1;
        int res = length - k;
        while(count < res){
            head = head.next;
            count++;
        }

        ListNode newHead = head.next;
        head.next = null;

        return newHead;
    }
}