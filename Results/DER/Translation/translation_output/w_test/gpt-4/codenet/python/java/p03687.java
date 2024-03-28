Below is the Java equivalent of the provided Python code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class DistinctCharacterSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        HashMap<Character, Integer> counter = new HashMap<>();
        for(char c : input.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        int minSequenceLength = Integer.MAX_VALUE;
        
        for(char key : counter.keySet()) {
            int j = 0, maxSequence = 0;
            for(char s : input.toCharArray()) {
                if(key == s) {
                    j = 0;
                } else {
                    j++;
                    maxSequence = Math.max(maxSequence, j);
                }
            }
            minSequenceLength = Math.min(minSequenceLength, maxSequence);
        }
        
        System.out.println(minSequenceLength);
    }
}
```

To run the Java code, you can use a testing input as follows:

```java
public static void main(String[] args) {
   // Instead of scanning from the scanner just directly use the test input
   String input = "serval";
   // The rest of the code follows as above...
}
```

Placing the test input directly in the `input` variable will allow you to get the expected output without manual entry when running the code.
