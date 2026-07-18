package Easy.ARRAYS;
import java.util.HashSet;
import java.util.Set;
public class MissingPositiveN0 {
    private static int missingNumber(int arr[])
    {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        
        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }
        
        return smallest;
    }
    public static void main(String[] args) {
        int []arr=new int[]{2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }
    
}//Output: 3




