# Two Sum - Pair with Given Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of integers and another integer  **target**. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

 **Examples:** 

```
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: arr[3] + arr[4] = -3 + 1 = -2
```

```
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: None of the pair makes a sum of 0

```

```
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[]
```

 **Constraints:** 
1 ≤ arr.size ≤ 105
-105 ≤ arr[i] ≤ 105
-2 *105 ≤ target ≤ 2* 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:23:45.221Z  

```java
class Solution {
    boolean twoSum(int arr[], int target) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int x:arr){
            int required = target-x;
            
            if(set.contains(required)){
                return true;
            }
            set.add(x);
        }
        return false;
        
        
        
        
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i =0;i<arr.length;i++){
            int x = arr[i];
            
            int required = target-x;
            
            if(map.containsKey(required)){
                return true;
            }
            map.put(x,i);
        }
        return false;
        */
        
        
        
        
        
        
        
        
    /*    int sum = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;   */
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/key-pair5616/1)