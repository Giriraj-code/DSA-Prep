class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        for (int i = 0; i + k <= list.size(); i += k) {
            int left = i;
            int right = i + k - 1;

            while (left < right) {
                int t = list.get(left);
                list.set(left, list.get(right));
                list.set(right, t);
                left++;
                right--;
            }
        }

        temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

        return head;
    }
}