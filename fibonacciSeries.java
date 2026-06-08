class fibonacciSeries{
    public static void main(String[] args){
        int n = 10;
        int firstNo = 0;
        int secondNo= 1;

        System.out.println("Fibonacci Series: "+n);
        for(int i = 0; i<=n; i++){
            System.out.println(firstNo + " ");
            int nextNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = nextNo;
            
        }
    }
}