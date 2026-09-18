class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        int[] zeros = new int[n];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                zeros[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = zeros[i];
        }
    }
}