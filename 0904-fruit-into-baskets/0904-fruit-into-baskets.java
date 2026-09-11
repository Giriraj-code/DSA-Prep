class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l = 0;
        int r = 0;
        int MaxLen = 0;
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0) + 1);
            
            while(map.size() > k){
                map.put(fruits[l], map.getOrDefault(fruits[l],0) - 1);

                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            MaxLen = Math.max(MaxLen, r-l+1);
            r++;
        }
        return MaxLen;
    }
}