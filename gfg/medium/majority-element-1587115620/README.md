# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**. Find the  **majority element**  in the array. If no majority element exists, return  **-1**.

 **Note:**  A majority element in an array is an element that appears  **strictly** more than **arr.size()/2** times in the array.

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.

```

```
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.
```

```
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T23:20:34.805Z  

```java
class Solution {
	int majorityElement(int arr[]) {
	    // Step 1: Find the candidate
             int candidate = 0;
             int count = 0;

             for (int i = 0; i < arr.length; i++) {

                 if (count == 0) {
                     candidate = arr[i];
                 }

                 if (arr[i] == candidate) {
                     count++;
                 } else {
                     count--;
                 }
             }

             // Step 2: Verify the candidate
             int frequency = 0;

             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] == candidate) {
                     frequency++;
                 }
             }

             // Step 3: Check if candidate is actually majority
             if (frequency > arr.length / 2) {
                 return candidate;
             }

             return -1;
	    
	    
	    
	    
	/*	
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			
		}
		for (int key : map.keySet()) {
			if (map.get(key)> n/2) {
				return key;
			}
		}
		return - 1;    */
		
		
		
		
		
		
/*		
		int n = arr.length;
		
		for (int i = 0; i<n; i++) {
			int count = 0;
			
			for (int j = 0; j<n; j++) {
				if (arr[i] == arr[j]) {
					count ++;
				}
			}
			if (count> n/2) {
				return arr[i];
			}
		}
		return - 1;    */
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1)