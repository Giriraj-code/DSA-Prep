
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Count total nodes
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: If head needs to be removed
        if (len == n) {
            return head.next;
        }

        // Step 3: Reach the node before the one to delete
        temp = head;

        for (int i = 1; i < len - n; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the node
        temp.next = temp.next.next;

        return head;
    }
}
