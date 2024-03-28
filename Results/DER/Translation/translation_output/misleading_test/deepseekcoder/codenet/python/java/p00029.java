<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures 

```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String maxCountWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords = new ArrayList<>();
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println(longestWords.contains(maxCountWord) ? maxCountWord : longestWords.get(0));
    }
}
```

This Java code reads a line of input, splits it into words, counts the occurrences of each word, and finds the longest words. It then prints the word that occurs most frequently among the longest words. If there are multiple such words, it prints the first one it encounters.
<|EOT|>
