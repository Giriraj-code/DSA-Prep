package Easy;
class CellingOfANumber {

    public static int Celling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return - 1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;// find mid without overflowing 

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid + 1; // go right
            }else{
                end = mid - 1; // go left
            }
        }
            return start; 
    }

    public static void main(String[] args){
        int[] arr = {1,3,6,9,10,12,15,17};
        int target = 11;
        int result = Celling(arr,target);
        if(result != -1){
            System.out.println("Celling of :"+target+" is "+arr[result]);
        }
    }
}