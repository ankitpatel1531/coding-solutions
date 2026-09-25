# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return  *the length of the longest consecutive elements sequence.* 

You must write an algorithm that runs in `O(n)` time.

 

 **Example 1:** 

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

 **Example 2:** 

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

 **Example 3:** 

```
Input: nums = [1,0,1,2]
Output: 3

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 96.04%)  
**Memory:** 77.3 MB (beats 97.08%)  
**Submitted:** 2026-09-25T03:27:44.767Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        int longest = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;



        //      Brute Force 
        /*
        int longest =0;
        for(int i =0;i<nums.length;i++){
            int current = nums[i];
            int count = 1;
        
            while(linearSearch(nums, current + 1)){
                current++;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
        
        }
        public boolean linearSearch(int[] nums, int target){
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
        */
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)