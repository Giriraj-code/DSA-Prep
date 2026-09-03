class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        // first Window
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }

        int Maximum = sum;
        int l = 0;
        int r = k -1;

        while(r < n-1){
            sum = sum - nums[l];
            l++;

            r++;
            sum = sum + nums[r];
            Maximum = Math.max(Maximum,sum);
        }
        return (double) Maximum/k;
    }
}