# Union of 2 Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two  **sorted**  arrays  **a[]**  and  **b[]**, where each array may contain  **duplicate**  elements, the task is to return the elements in the  **union**  of the two arrays in  **sorted**  order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

 **Examples:** 

```
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
```

```
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
```

```
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Distinct elements including both the arrays are: 1 2.
```

 **Constraints:** 
1  ≤  a.size(), b.size()  ≤  105
-109 ≤ a[i], b[i] ≤109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T22:36:29.072Z  

```java
// // Java.util.*;
// class Solution {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
//         // code here
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int i =0;i<a.length;i++){
//             set.add(a[i]);
//         }
//         for(int i =0;i<b.length;i++){
//             set.add(b[i]);
//         }
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int x: set){
//             list.add(x);
//         }
//         Collections.sort(list);
//         return list;
        
        class Solution {
            public static ArrayList<Integer> findUnion(int a[], int b[]) {

                HashSet<Integer> set = new HashSet<>();

                // Add elements of a
                for (int i = 0; i < a.length; i++) {
                    set.add(a[i]);
                }

                // Add elements of b
                for (int i = 0; i < b.length; i++) {
                    set.add(b[i]);
                }

                // Convert HashSet to ArrayList
                ArrayList<Integer> list = new ArrayList<>(set);

                // Sort the result
                Collections.sort(list);

                return list;
            
        

    
 /*   
    // if agr hash set se poochta to but ye unique value store krta haia 
    // aur unorder hota hai  lekin iski time coplexty sbse best hai
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < a.length; i++) {
        set.add(a[i]);
    }

    for (int i = 0; i < b.length; i++) {
        set.add(b[i]);
    }

    int[] union = new int[set.size()];
    int i = 0;

    for (int x : set) {
        union[i++] = x;
    }

    return union;
        
      
      */          
    }
    
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1)