class Solution {
    public int minimumDeletions(int[] nums) {
        int mini = 0;
        int maxi = 0;
        int n = nums.length;
        for(int i = 0;i<n; i++){
            if(nums[mini] > nums[i]){
                mini = i;
            }
            if(nums[maxi] < nums[i]){
                maxi = i;
            }
        }   

        int condition = n - (Math.abs(mini - maxi) - 1);
        int condition2 = 0;
        if(maxi < mini){
            condition2 = Math.min(n - maxi,mini + 1);
        }
        else{
            condition2 = Math.min(n - mini,maxi + 1);
        }

        return Math.min(condition,condition2);

    }
}