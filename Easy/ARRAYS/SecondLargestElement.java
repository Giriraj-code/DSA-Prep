package Easy.ARRAYS;

class SecondLargestNumber{
    public static int Printer(int[] num){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int nums : num){ // Enhanced for loop to iterate through the array
            if(nums > largest){
                secondLargest = largest;
                largest = nums;
            }else if(nums > secondLargest && nums != largest){
                secondLargest = nums;
            }
        }  
        return secondLargest;
    }
    public static void main(String[] args){
        int[] num = {10, 5, 20, 8, 20};
        int result = Printer(num);
        System.out.print(result);
    }
}
