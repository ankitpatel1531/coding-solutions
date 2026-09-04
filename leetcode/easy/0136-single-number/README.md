# Single Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **non-empty**  array of integers `nums`, every element appears  *twice*  except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

 **Example 1:** 

 **Input:**  nums = [2,2,1]

 **Output:**  1

 **Example 2:** 

 **Input:**  nums = [4,1,2,1,2]

 **Output:**  4

 **Example 3:** 

 **Input:**  nums = [1]

 **Output:**  1

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104
- Each element in the array appears twice except for one element which appears only once.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 19.82%)  
**Memory:** 46.9 MB (beats 46.00%)  
**Submitted:** 2026-09-04T00:21:15.274Z  

```java
// class Solution {
//     public int singleNumber(int[] nums) {
//         int xor=0;
//         for(int i =0;i<nums.length;i++){
//             xor = xor^nums[i];
//         }
//         return xor;

//     }
// }
class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i];

            // map.put(x, map.getOrDefault(x, 0) + 1);

            //or

            // if (map.containsKey(x)) {
            //     map.put(x, map.get(x) + 1);
            // } else {
            //     map.put(x, 1);
            // }

            // or
            Integer count = map.get(x);

            if (count == null) {
                map.put(x, 1);
            } else {
                map.put(x, count + 1);
            }
        }

        for (long x : map.keySet()) {
            if (map.get(x) == 1) {
                return (int) x;
            }
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number/)