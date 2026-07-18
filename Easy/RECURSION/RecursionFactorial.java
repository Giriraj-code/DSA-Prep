package Easy.RECURSION;

class RecursionFactorial {

    public static long Factorial(int n){
        if(n <= 0 || n == 1){
            return 1;
        }
        return n*Factorial(n - 1);
    }

    public static void main(String[] args){
      long result = Factorial(5);
      System.out.println(result);
    }
}