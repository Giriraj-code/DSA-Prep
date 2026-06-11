package Easy;

class Factorial {
    public static void Factorial(int n, int fact){
         for(int i = 1; i<=n; i++){
        fact *= i;
        System.out.println(n+" "+fact);
    }
    }
   
    public static void main(String[] args){
        Factorial(5,1);
    }
}
