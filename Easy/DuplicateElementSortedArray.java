package Easy;

public class DuplicateElementSortedArray {

    public static int removeDuplicates(int[] nums) {
        int l = nums.length;
        int k = 1;

        for(int i = 1; i<l; i++){
            if(nums[i] != nums[i-1]){
               nums[k] = nums[i];
               k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,4,4,5};
       int result = removeDuplicates(nums);
        System.out.println(result);
    }  

}
