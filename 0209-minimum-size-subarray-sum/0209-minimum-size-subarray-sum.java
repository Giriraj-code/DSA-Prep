class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int l = 0;
        int sum = 0;
        int Minimum = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r++) {

            sum += nums[r];

            while(sum >= target) {

                Minimum = Math.min(Minimum, r - l + 1);

                sum -= nums[l];
                l++;
            }
        }

        return Minimum == Integer.MAX_VALUE ? 0 : Minimum;
    }
}