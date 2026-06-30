package Easy;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 4, 10, 2};

        System.out.print("Duplicate elements: ");
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break; 
                }
            }
        }
    }
}