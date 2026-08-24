# LJAAS150

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that first accepts the number of test cases  **t**. For each test case, read an integer  **num**. Check if  **num**  is even using the  **isEven**  function. If  **num**  is even, output  **"Even"** ; otherwise, output  **"Odd"**.

### Sample 1:
Input
Output

```
3
2
6
5
```

```
Even
Even
Odd
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T13:57:10.145Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code goes here
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i =0;i<t;i++ ){
            int num = sc.nextInt();
            
            if (isEven(num)){
                System.out.println("Even");
            } else{
                System.out.println("Odd");
            }
        } 
        
    }
    
    public static boolean isEven(int num) {
        // Complete this method 
        return num%2==0;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS150)