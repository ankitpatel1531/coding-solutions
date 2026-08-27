# NOGJPU11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A student, Alex, has received scores in two subjects: "Ancient Runes" and "Potions". These scores can include decimal points (e.g., 85.5).

Your task is to write a Java program that:

- Declares two float variables to store Alex's scores: ancientRunesScore initialized to 88.5. potionsScore initialized to 91.25.
- Declares a variable named averageScore.
- Calculates the average of ancientRunesScore and potionsScore. Store this result in the averageScore variable.
- Prints the student's name, the score for each subject, and the calculated average score to the console.

 **Expected Output** 

```
Student: <value>
Ancient Runes Score: <value>
Potions Score: <value>
Average Score: <value>

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T20:10:23.498Z  

```java
class AverageScoreCalculator {
    public static void main(String[] args) {
        String studentName = "Alex";
        
        float anciantRunesScore = 88.5f;
        float potionScore = 91.25f;
        
        float averageScore = (anciantRunesScore+potionScore)/2;
        
        System.out.println("Student: "+studentName);
        System.out.println("Ancient Runes Score: "+ anciantRunesScore);
        System.out.println("Potions Score: "+ potionScore);
        System.out.println("Average Score: "+averageScore);
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NOGJPU11)