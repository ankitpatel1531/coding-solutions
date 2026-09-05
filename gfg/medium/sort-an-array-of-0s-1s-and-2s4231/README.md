# Sort 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing only  **0s, 1s, and 2s.**  Sort the array in ascending order.
 **Note:**  You need to solve this problem without utilizing the built-in sort function.

 **Examples:** 

```
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

```
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:56:13.375Z  

```java
class Solution {
	public void sort012(int[] arr) {
		
		// Use dutch National flag Algorithm Use three pointers:
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		
		while (mid <= high) {
			if (arr[mid] == 0) {
				
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				low++;
				mid++;
			}
			else if(arr[mid] == 1){
			    mid++;
			}
			else{
			    // arr[mid]==2
			    
			    int temp = arr[mid];
			    arr[mid] = arr[high];
			    arr[high] = temp;
			    high--;
			    
			}
		}
		
		/*
		Arrays.sort(arr);
		*/
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)