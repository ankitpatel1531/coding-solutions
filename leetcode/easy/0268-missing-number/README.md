# Missing Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return  *the only number in the range that is missing from the array.* 

 

 **Example 1:** 

 **Input:**  nums = [3,0,1]

 **Output:**  2

 **Explanation:** 

`n = 3` since there are 3 numbers, so all numbers are in the range `[0,3]`. 2 is the missing number in the range since it does not appear in `nums`.

 **Example 2:** 

 **Input:**  nums = [0,1]

 **Output:**  2

 **Explanation:** 

`n = 2` since there are 2 numbers, so all numbers are in the range `[0,2]`. 2 is the missing number in the range since it does not appear in `nums`.

 **Example 3:** 

 **Input:**  nums = [9,6,4,2,3,5,7,0,1]

 **Output:**  8

 **Explanation:** 

`n = 9` since there are 9 numbers, so all numbers are in the range `[0,9]`. 8 is the missing number in the range since it does not appear in `nums`.

 
 

 

 

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 104
- 0 <= nums[i] <= n
- All the numbers of nums are unique.

 

 **Follow up:**  Could you implement a solution using only `O(1)` extra space complexity and `O(n)` runtime complexity?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.4 MB (beats 49.00%)  
**Submitted:** 2026-09-03T22:09:29.784Z  

```java
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int totalsum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            
        }
        return totalsum-sum;
        

        /*
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        return -1;
        */

        
        /*
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        return nums.length;
        */

        /*  for(int i =1;i<=n;i++){
            int flag=0;
            for(int j =0;j<n;j++){
                if(nums[j] ==i){
                    flag =1;
                    break;
                }
            }if(flag ==0)
                return i;
            
        }
        return 0;
        
        */

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/missing-number/)