# LJAAS110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that uses a do-while loop to find the factorial of a given input number.

### Sample 1:
Input
Output

```
5
```

```
120
```

### Explanation:

1 x 2 x 3 x 4 x 5 = 120

### Sample 2:
Input
Output

```
6
```

```
720
```

### Explanation:

1 x 2 x 3 x 4 x 5 x 6 = 720

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T13:46:30.898Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int factorial=1;
	    int i =1;
	    
	    do{
	        factorial = factorial*i;
	        i++;
	    }
	    while (i<=n);
	    
	    System.out.println(factorial);
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS110)