class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int mm = (n / 3) + 1;
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == mm){
                ls.add(nums[i]);
            }
        }
    return ls;
    }
}