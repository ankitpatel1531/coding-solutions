# Next Permutation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers  **arr[]**  representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically smallest greater (or next) permutation.

If no next permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

 **Examples:** 

```
Input: arr[] = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is [2, 4, 5, 0, 1, 7].
```

```
Input: arr[] = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

```

```
Input: arr[] = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is [3, 4, 5, 1, 2].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T00:30:57.621Z  

```java
class Solution {
	void nextPermutation(int[] arr) {
		// code here
		int n = arr.length;
		int i;
		
		for (i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				break;
			}
		}
		
		if (i >= 0) {
			int j;
			
			for (j = n - 1; j > i; j--) {
				if (arr[j] > arr[i]) {
					break;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		int left = i + 1;
		
		for (int right = n - 1; left < right; left++, right--) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-permutation5226/1)