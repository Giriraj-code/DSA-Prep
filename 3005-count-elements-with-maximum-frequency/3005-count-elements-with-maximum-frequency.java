class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;
        int totalElementsWithMaxFreq = 0;

        for (int num : nums) {
            int currentFreq = frequencies.getOrDefault(num, 0) + 1;
            frequencies.put(num, currentFreq);

            if (currentFreq > maxFrequency) {
                maxFrequency = currentFreq;
                totalElementsWithMaxFreq = currentFreq;
            } else if (currentFreq == maxFrequency) {
                totalElementsWithMaxFreq += currentFreq;
            }
        }

        return totalElementsWithMaxFreq;
    }
}