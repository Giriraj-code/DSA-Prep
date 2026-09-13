class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[] LastSeen = {-1,-1,-1};
        for(int i = 0; i<n; i++){
            LastSeen[s.charAt(i) - 'a'] = i;

            if(LastSeen[0] != -1 && LastSeen[1] != -1 && LastSeen[2] != -1){
                count = count + ( 1 + Math.min(LastSeen[0], Math.min(LastSeen[1], LastSeen[2])));
            }
        }
        return count;
    }
}