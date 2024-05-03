Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Integer> wordLength = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            wordLength.put(word, word.length());
        }

        String maxCountWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        String maxLengthWord = Collections.max(wordLength.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println(maxCountWord + " " + maxLengthWord);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into words, and then counts the occurrences of each word and the length of each word. It then finds the word with the maximum count and the word with the maximum length and prints them.
