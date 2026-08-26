# Intersection of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two sorted arrays  **arr1** [] and  **arr** 2[]. Your task is to return the  **intersection** of both arrays.
Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements.
Note: If there is no intersection then return an empty array.

 **Examples**  **:** 

```
Input: arr1[] = [1, 2, 3, 4], arr2[] = [2, 4, 6, 7, 8]
Output: [2, 4]
Explanation: 2 and 4 are only common elements in both the arrays.
```

```
Input: arr1[] = [1, 2, 2, 3, 4], arr2[] = [2, 2, 4, 6, 7, 8]
Output: [2, 4]
Explanation: 2 and 4 are the only common elements.
```

```
Input: arr1[] = [1, 2], arr2[] = [3, 4]
Output: []
Explanation: No common elements.
```

 **Constraints:** 
1 ≤ arr1.size(),arr2.size() ≤ 105
1 ≤ arr1[i], arr2[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T02:09:54.961Z  

```java
// class Solution {
// 	static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
	    
	    
	    
		
// 		/*
// 		int n = arr1.length + arr2.length;
// 		ArrayList<Integer> list = new ArrayList<>();
// 		int[] vis = new int[n];
		
// 		for (int i = 0; i<arr1.length; i++) {
// 			if (i > 0 && arr1[i - 1] == arr1[i])
// 				continue;
// 			for (int j = 0; j<arr2.length; j++) {
// 				if (arr1[i] == arr2[j] && vis[j] == 0) {
// 					list.add(arr1[i]);
// 					vis[j] = 1;
// 					break;
// 				}
// 				if (arr2[j] >arr1[i])
// 					break;
// 			}
			
// 		}
// 		return list;
// 		// code here
// 		*/
		
// 	}
// }
class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] == arr2[j]) {

                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }

                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1)