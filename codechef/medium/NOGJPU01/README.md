# NOGJPU01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An arcade game machine needs to display a player's high score. You are tasked with writing a small Java program to manage and display this information.

Initially, a player named "RetroGamer" has a high score of 50000 points. After a new game session, "RetroGamer" achieves a new, better high score of 75000 points.

 **Your task is to:** 

- Declare a variable to store the player's name and initialize it with the value "RetroGamer".
- Declare a variable to store the player's high score and initialize it with the value 50000.
- Print the player's name and their initial high score.
- The player has now achieved a new high score. Update the variable storing the high score to the new value of 75000.
- Print the player's name and their new (updated) high score.

 **Expected Output:** 

```
Player: RetroGamer, Initial High Score: <value>
Player: RetroGamer, New High Score: <value>

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T19:53:27.577Z  

```java
class ArcadeHighScore {
    public static void main(String[] args) {
        
        // player name declaration and initialization here
        String playerName = "RetroGamer";
        
        // high score declaration and initialization here
        int highScore = 50000;
        
        // printing initial score here
        System.out.println("Player: " + playerName+", Initial High Score: "+ highScore);
        
        // updating high score here
        highScore = 75000;
        
        
        // printing new score here
        System.out.println("Player: "+ playerName+", New High Score: "+ highScore);
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NOGJPU01)