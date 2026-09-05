# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 43.40%)  
**Memory:** 53.2 MB (beats 10.66%)  
**Submitted:** 2026-09-05T11:57:05.474Z  

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        List<Integer> result = new ArrayList<>();

        for (int key : map.keySet()){
            if(map.get(key)> n/3){
                result.add(key);
            }
        }
        return result;
        
    }
}
// import java.util.*;

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {

//         int n = nums.length;

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Count frequency
//         for (int i = 0; i < n; i++) {

//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         // Find elements appearing more than n/3 times
//         List<Integer> result = new ArrayList<>();

//         for (int key : map.keySet()) {

//             if (map.get(key) > n / 3) {
//                 result.add(key);
//             }
//         }

//         return result;
//     }
// }
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)