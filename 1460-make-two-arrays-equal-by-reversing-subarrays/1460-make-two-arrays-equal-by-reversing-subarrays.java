class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < target.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (target[i] == arr[j] && !visited[j]) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}