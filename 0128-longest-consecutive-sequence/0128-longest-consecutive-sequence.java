class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) {
            return 0;
        }

        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int longest = 0;
        for(int num : st){
            if(!st.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;
                while(st.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}