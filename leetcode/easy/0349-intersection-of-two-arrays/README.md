# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.8 MB  
**Submitted:** 2026-08-29T13:34:33.842Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] vis = new int[nums2.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(list.contains(nums1[i])) {
                continue;
            }    
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && vis[j]==0 ){
                    list.add(nums1[i]);
                    vis[j] = 1;
                    break;
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }return ans;      
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)