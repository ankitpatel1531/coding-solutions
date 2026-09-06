# Maximum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, find the subarray with the largest sum, and return  *its sum*.

 

 **Example 1:** 

```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

```

 **Example 2:** 

```
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

```

 **Example 3:** 

```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104

 

 **Follow up:**  If you have figured out the `O(n)` solution, try coding another solution using the  **divide and conquer**  approach, which is more subtle.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.94%)  
**Memory:** 77.3 MB (beats 32.46%)  
**Submitted:** 2026-09-06T01:26:08.586Z  

```java
class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        // Finding the maximum sum of a contiguous subarray.
        int n = nums.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n ; i++){
            sum += nums[i];

            if(sum>max){
                max = sum;
            }

            if(sum<0){
                sum =0;
            }
        }
        return max;



        /*
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum + nums[j];
                max = Math.max(sum,max);

            }
        }return max;
        */



        /*
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                int sum = 0;
                for(int k =i;k<=j;k++){
                    sum = sum + nums[k];
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
        */
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-subarray/)