Here's a Java equivalent of the Python code you've given me:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input and splitting into an array
        String[] a = scanner.nextLine().split(" ");
        
        // Finding the element with the highest frequency
        String mostFrequentElement = null;
        int mostFrequency = 0;
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : a) {
            int frequency = frequencyMap.getOrDefault(element, 0) + 1;
            frequencyMap.put(element, frequency);
            
            if (frequency > mostFrequency) {
                mostFrequentElement = element;
                mostFrequency = frequency;
            } else if (frequency == mostFrequency && mostFrequentElement != null 
                    && element.compareTo(mostFrequentElement) < 0) {
                // Tie-breaker: choose the lexicographically smaller element
                mostFrequentElement = element;
            }
        }
        
        // Finding the longest element
        String longestElement = Arrays.stream(a)
                                  .max((e1, e2) -> Integer.compare(e1.length(), e2.length()))
                                  .orElse(null);

        System.out.println(mostFrequentElement + " " + longestElement);

        scanner.close();
    }
}
```

This Java code reads a line from the standard input, splits it into an array of strings, and then computes the most frequent element as well as the longest element from the input array. Unlike Python, Java requires explicit import of classes and declaration of types, which can make equivalent functionality more verbose. This code uses a `HashMap` to store and count the frequency of elements and a stream with a comparator to find the longest element.
