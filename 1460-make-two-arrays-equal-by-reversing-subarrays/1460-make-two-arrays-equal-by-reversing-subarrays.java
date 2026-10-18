
import java.util.HashMap;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < target.length; i++) {
            int num = target[i];

            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }

            map.put(num, map.get(num) - 1);
        }

        return true;
    }
}
