package Easy.RECURSION;
class RecursiveFibonacciSeries {
    public static int Fibonacci(int n) {
        if (n <= 0) {
            return n;
        } else if (n == 1) {
            return n;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i <= count; i++) {
            System.out.println(Fibonacci(i) + " ");
        }
    }
}