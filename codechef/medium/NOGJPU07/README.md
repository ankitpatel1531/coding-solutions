# NOGJPU07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are working for a demographics research institute. Your task is to store and display population figures. You need to represent three pieces of data:

- The city name
- The population of a moderately sized city, "Springfield", which is 75,320.
- The estimated current global population, which is 8,123,456,789.

Declare appropriate variables using appropriate data types to store these values. Then, print these values to the console with descriptive labels.

 **Expected Output** 

```
City name : <value>
City Population: <value>
Global Population: <value>

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T20:05:55.566Z  

```java
class PopulationTracker {
    public static void main(String[] args) {
 
        // TODO: Your code for writing cityname here
        String cityname = "Springfield";
 
      
        // TODO: Your code for springfieldPopulation here
        int springfieldPopulation=75320;
        
        // TODO: Your code for globalPopulation here
        long globalPopulation=8123456789L;
        
        // TODO: Your print statement for cityname here 
        System.out.println("City name : "+ cityname);
       
        // TODO: Your print statement for Springfield's population here
        System.out.println("City Population: "+ springfieldPopulation);

        // TODO: Your print statement for global population here
        System.out.println("Global Population: "+globalPopulation);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NOGJPU07)