class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        int MaxSum = 0;

        for(int i = 0; i<k; i++){
            leftSum += cardPoints[i];
        }
        MaxSum = leftSum;
        int rightIndex = n-1;
        for(int i = k-1; i>=0; i--){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            MaxSum = Math.max(MaxSum,leftSum+rightSum);
        }
        return MaxSum;
    }
}