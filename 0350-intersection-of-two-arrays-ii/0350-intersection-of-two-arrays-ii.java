
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();

      
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num : nums2) {
            if (freq.getOrDefault(num, 0) > 0) {
                temp[k++] = num;
                freq.put(num, freq.get(num) - 1);
            }
        }

        return Arrays.copyOf(temp, k);
    }
}
