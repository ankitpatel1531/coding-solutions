class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
       
       
    //   use only for non negative number
    /*
        int left= 0;
        int sum =0;
        int max=0;
        
        for(int right = 0;right< arr.length;right++){
            sum = sum + arr[right];
            
            while(sum >k && left <= right){
                sum = sum - arr[left];
                left++;
            }
            if(sum ==k){
                max = Math.max(max, right-left +1);
            }
        }
        return max;
*/        
        

        
        
        // use only non negative number
        /*
        int max = 0;
        for(int i =0;i<arr.length;i++){
            int sum =0;
            
            for(int j =i;j<arr.length;j++){
                sum = sum+ arr[j];
                
                if(sum ==k){
                    max= Math.max(max, j-i+1);
                }
            }
        }
        return max;  */
        
        
        
        
        
        
        
        
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
