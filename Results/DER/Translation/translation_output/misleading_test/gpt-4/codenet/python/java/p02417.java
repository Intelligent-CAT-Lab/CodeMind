Here is the translated Java code from the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphabetFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            for (char ch : inputLine.toCharArray()) {
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    stringBuilder.append(Character.toLowerCase(ch));
                }
            }
        }
        scanner.close();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : stringBuilder.toString().toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " : ");
            System.out.println(frequencyMap.getOrDefault(ch, 0));
        }
    }
}
```

To test this Java program as per your test input, you can use the following code snippet in a main method:
```java
public static void main(String[] args) {
    // Simulate input
    String data = "This is a pen.";
    InputStream stdin = System.in;
    
    try {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        
        // Your main method invocation
        AlphabetFrequency.main(args);
    } finally {
        System.setIn(stdin); // Restore original standard input
    }
}
```
Please note that Java does not have an equivalent to Python's `EOFError`. The equivalent mechanism in Java to check for end-of-input is checking if `scanner.hasNextLine()` returns `false`. In this example, I assume that the input ends when there is no next line to read from `System.in`.
