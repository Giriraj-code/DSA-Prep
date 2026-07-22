package Easy.RECURSION;

class Solution{
    public void printName(String name, int N, int count){
        if(count == N){
            return;
        }
        System.out.println(name);
        printName(name,N,count+1);
    }
}

public class RecursionPrintName {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String name = "Rahul";
        int N = 5;
        sol.printName(name, N, 0);
    }
}
