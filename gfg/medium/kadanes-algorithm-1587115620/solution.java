class Solution {
    int maxSubarraySum(int[] arr) {
        // Kadane's Algorithm
        // Finding the maximum sum of a contiguous subarray.
        int n = arr.length;
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            sum += arr[i];
            
            max= Math.max(max,sum);
            // if(sum>0){
            //     max = sum;
            // }
            
            if(sum<0){
                sum =0;
            }
            
        }
        return max;
    }
}
