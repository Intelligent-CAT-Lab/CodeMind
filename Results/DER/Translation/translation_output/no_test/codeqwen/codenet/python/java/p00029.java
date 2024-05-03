Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        
        Map<String, Integer> map = new HashMap<>();
        for (String s : a) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        String maxByCount = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        String maxByLength = Arrays.stream(a).max(Comparator.comparingInt(String::length)).get();
        
        System.out.println(maxByCount + " " + maxByLength);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into words, counts the occurrences of each word, and then finds the word with the maximum count and the longest word. It then prints these two words.
