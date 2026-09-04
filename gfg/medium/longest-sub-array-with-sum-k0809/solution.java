class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            long required = sum - k;

            if (map.containsKey(required)) {

                int len = i - map.get(required);

                if (len > maxLen) {
                    maxLen = len;
                }
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
