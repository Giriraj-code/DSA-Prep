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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};
        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int position = 1;
        int first = -1;
        int previous = -1;
        int min = Integer.MAX_VALUE;
        int max = 0;
        while (curr.next != null) {
            ListNode next = curr.next;
            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {
                if (first == -1) {
                    first = position;
                }
                if (previous != -1) {
                    int distance = position - previous;
                    if (distance < min) {
                        min = distance;
                    }
                }
                previous = position;
                max = position - first;
            }
            prev = curr;
            curr = next;
            position++;
        }
        if (first == previous) {
            return ans;
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}