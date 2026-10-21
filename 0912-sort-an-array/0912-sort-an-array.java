class Solution {

        static int[] MergeSort(int[] nums, int low, int high){
            
            if(low >= high){
                return nums;
            }

            int mid = low + (high - low) / 2;

            MergeSort(nums,low,mid);
            MergeSort(nums,mid+1,high);
            Merger(nums,low,mid,high);
            return nums;
        }

        static void Merger(int[] nums, int low, int mid, int high){
            int[] temp = new int[high - low + 1];

            int i = low;
            int j = mid + 1;
            int k = 0;

            while(i <= mid && j <= high){
                if(nums[i] < nums[j]){
                    temp[k] = nums[i];
                    i++;
                }else{
                    temp[k] = nums[j];
                    j++;
                }
                k++;
            }

            while(i <= mid){
                temp[k] = nums[i];
                i++;
                k++;
            }

            while(j <= high){
                temp[k] = nums[j];
                j++;
                k++;
            }

            for(int p = 0; p<temp.length; p++){
                nums[low + p] = temp[p];
            }
        }
    public int[] sortArray(int[] nums) {
      MergeSort(nums,0,nums.length - 1);
      return nums;
    }
}