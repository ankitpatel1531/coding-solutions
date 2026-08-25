# Merge Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two integer arrays `nums1` and `nums2`, sorted in  **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

 **Merge**  `nums1` and `nums2` into a single array sorted in  **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be  *stored inside the array* `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

 

 **Example 1:** 

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

```

 **Example 2:** 

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

```

 **Example 3:** 

```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

```

 

 **Constraints:** 

- nums1.length == m + n
- nums2.length == n
- 0 <= m, n <= 200
- 1 <= m + n <= 200
- -109 <= nums1[i], nums2[j] <= 109

 

 **Follow up:** Can you come up with an algorithm that runs in `O(m + n)` time?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 17.33%)  
**Memory:** 44.3 MB (beats 9.20%)  
**Submitted:** 2026-08-25T17:00:34.392Z  

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            temp[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            temp[k++] = nums2[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }

/*        ArrayList<Integer> set = new ArrayList<>();
        for(int i =0;i<m;i++){
            set.add(nums1[i]);
        }
        for(int i =0;i<n;i++){
            set.add(nums2[i]);
        }
        Collections.sort(set);
        int i =0;

        for(int j =0;j<set.size();j++){
            nums1[i++] = set.get(j);
        }

    */   
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-sorted-array/)