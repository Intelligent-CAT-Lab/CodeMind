<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

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

        String mostFrequentWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println(mostFrequentWord);
        System.out.println(longestWords.get(0));
    }
}
```

This Java code reads a line of input, splits it into words, and then finds the most frequent word and the longest word. It uses a HashMap to count the frequency of each word and a list to store the longest words. The most frequent word is found using the Collections.max method with a custom comparator that compares the values of the entries in the HashMap. The longest word is found by iterating over the words and updating the longest word(s) whenever a longer word is found.<｜end▁of▁sentence｜>
