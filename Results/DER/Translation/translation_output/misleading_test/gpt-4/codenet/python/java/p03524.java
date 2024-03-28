Here's the translated Java code. I've added the necessary imports and organized it into a simple class structure assuming the main method is the entry point. I adjusted the approach to work with Java's syntax and types:

```java
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> sFrqMap = new HashMap<>();
        sFrqMap.put('a', 0);
        sFrqMap.put('b', 0);
        sFrqMap.put('c', 0);

        for (char s : S.toCharArray()) {
            sFrqMap.put(s, sFrqMap.get(s) + 1);
        }

        int maxFreq = Collections.max(sFrqMap.values());
        int minFreq = Collections.min(sFrqMap.values());

        if (maxFreq - minFreq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Now to test this with the input provided ("abac"), you would run the Java program and introduce the string when prompted for input. The expected output would be "YES" because the difference between the max and min frequencies of 'a', 'b', and 'c' in the string "abac" is 1, which meets the given condition. 

Note: The frequency check is done only for 'a', 'b', and 'c' as the original Python code did, but the Java code could be easily extended to support additional characters if needed.

**Correction**: The expected output stated in the problem was "ES", which seems to be a typo or mistake, as the correct expected output according to the logic in the given Python code should indeed be "YES".
