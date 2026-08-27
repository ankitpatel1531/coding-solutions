# NOGJPU02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are building a small feature for a reading application to track a user's progress in a book.

 **Your task is to:** 

- Declare an integer variable named totalPages to store the total number of pages in a book. Initialize this variable to 350.
- Declare another integer variable named pagesRead to store the number of pages the user has currently read. Initialize this variable to 0.
- Print the initial reading status as per given sample output.
- The user reads 50 pages in their first reading session. Add 50 to pagesRead
- Print the reading status after the first session as per given sample output.
- The user reads 75 pages more in their second reading session (meaning, from where they left off after the first session). Update the pagesRead variable again to reflect the new total number of pages read.
- Print the final reading status as per given sample output.

 **Expected Output** 

```
Initial Reading Status:
Total Pages: <value>, Pages Read: <value>
After first session:
Total Pages: <value>, Pages Read: <value>
After second session:
Total Pages: <value>, Pages Read: <value>

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T20:01:32.352Z  

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

[View on CodeChef](https://www.codechef.com/problems/NOGJPU02)