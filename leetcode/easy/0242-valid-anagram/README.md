# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.65%)  
**Memory:** 44.8 MB (beats 52.97%)  
**Submitted:** 2026-09-04T01:00:36.666Z  

```java
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    int[] count = new int[26];

    for (final char c : s.toCharArray())
      ++count[c - 'a'];

    for (final char c : t.toCharArray()) {
      if (count[c - 'a'] == 0)
        return false;
      --count[c - 'a'];
    }

    return true;
  }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)