package Easy;

class PalindromeNumber{

    public static boolean Printer(int x){
            
            if( x < 0){
                return false;
            }

            int original = x;
            int reverse = 0;

            while( x != 0){
                int digit = x % 10;
                reverse = reverse * 10 + digit;
                x = x / 10;
            }

            if(original == reverse){
                return true;
            }else{
                return false;
            }

        }

    public static void main(String[] args){
        boolean result = Printer(1897);
        System.out.println(result);
    }
}