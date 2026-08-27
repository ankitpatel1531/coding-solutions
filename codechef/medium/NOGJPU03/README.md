# NOGJPU03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T20:01:38.339Z  

```java

class ReadingTracker {
    public static void main(String[] args) {
        // Step 1: Declare and initialize totalPages and pagesRead
        int totalPages = 350;
        int pagesRead = 0;


        // Step 2: Print initial status
        System.out.println("Initial Reading Status:");
        System.out.println("Total Pages: "+ totalPages+ ", Pages Read: "+pagesRead);

        // Step 3: Update pagesRead after the first session (user read 50 pages)
        pagesRead = pagesRead+50;

        // Step 4: Print status after the first session
        System.out.println("After first session: ");
        System.out.println("Total Pages: "+ totalPages+ ", Pages Read: "+pagesRead);

        // Step 5: Update pagesRead after the second session (user has read 75 more)
        pagesRead = pagesRead+75;

        // Step 7: Print final status
        System.out.println("After second session:");
        System.out.println("Total Pages: "+ totalPages+", Pages Read: "+pagesRead);
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NOGJPU03)