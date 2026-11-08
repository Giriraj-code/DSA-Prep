class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        String binary = "";

        while (head != null) {
            binary += head.val;
            head = head.next;
        }

        result = Integer.parseInt(binary, 2);
        return result;
    }
}