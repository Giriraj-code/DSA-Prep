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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }
        ListNode temp = head;
        int position = 1;
        Stack<Integer> st = new Stack<>();
        while(position <= right){
            if(position >= left){
                st.push(temp.val);
            }
            temp = temp.next;
            position++;
        }
        temp = head;
        position = 1;

        while(position <= right){
            if(position >= left){
                temp.val = st.pop();
            }
            temp = temp.next;
            position++;
        }
        return head;
    }
}