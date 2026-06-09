class RecursiveFactorial{

    public static long Factorial(int n){
        if(n == 0 || n <= 0){
            return 1;
        }
        return n * Factorial(n-1);
    }

    public static void main(String[] args){
        int number = 5;
        long result = Factorial(number);

        System.out.println(number + " " + result);
    }
}