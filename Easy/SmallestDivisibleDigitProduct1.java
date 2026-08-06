package Easy;
class SmallestDivisibleDigitProduct1{

    public static int Answer(int n , int t){
        if(n == 0){
            return -1;
        }
        int current = n;

        while(true){
            int temp = current;
            int product = 1;

            while(temp > 0){
                int digit = temp % 10;
                product = product * digit;
                temp = temp / 10;
            }
            if(product % t == 0){
                return current;
            }
            current++;
        }
    }

    public static void main(String[] args){
        int n = 10;
        int t = 2;
        int ans = Answer(n,t);
        System.out.println(ans);

    }
} 