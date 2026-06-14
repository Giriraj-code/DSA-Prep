package Easy;

class ShiftZerosInArray{
    public static void Printer(int[] arr){
        int k = 0;
        for(int i = 0; i<arr.length; i++){// loop to iterate through the array
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }
            for(int i = k; i<arr.length; i++){
                arr[i] = 0;
            }
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,2,3,4};
        Printer(arr);
        for(int nums : arr){
            System.out.println(nums + " ");
        }
    }
}