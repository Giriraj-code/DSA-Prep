package Easy.ARRAYS;

class RemoveElement{
    public static int Element(int[] arr , int val , int val2){
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val && arr[i] != val2){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,4,5};
        int val = 4;
        int val2 = 2;
        int result = Element(arr,val,val2);
        System.out.println(result);
    }
}
