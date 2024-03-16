Sure, here is the equivalent Java code for the given Python script:

```java

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class UniqueSubstringsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> sortedCharacters = new ArrayList<>();
        for (char character : s.toCharArray()) {
            sortedCharacters.add(character);
        }
        Collections.sort(sortedCharacters);
        
        // Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : sortedCharacters) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        
        int l = s.length();
        
        // Sum of first (l - 1) natural numbers is l*(l-1)/2
        long res = ((long) l * (l - 1) / 2) + 1;
        
        // Subtract combinations of same character sequences
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int p = entry.getValue();
            res -= ((long) p * (p - 1) / 2);
        }
        System.out.println(res);
        
        scanner.close();
    }
}

``` 

Please note this Java code provides similar functionality to the given Python script. It reads a string, counts the number of unique characters, sorts them, and computes the result as specified in the Python script. Some concepts in Python such as generators or certain library functions may not have direct equivalents in Java, so in those cases, we use the most idiomatic Java solutions.
