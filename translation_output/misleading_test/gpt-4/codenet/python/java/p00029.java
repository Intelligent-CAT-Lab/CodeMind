Here is the Java equivalent code to the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        System.out.println(getMaxFrequencyWord(words) + " " + getMaxLengthWord(words));
    }

    private static String getMaxFrequencyWord(String[] words) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            } else if (entry.getValue() == maxCount && maxWord.compareTo(entry.getKey()) > 0) {
                maxWord = entry.getKey();
            }
        }
        return maxWord;
    }

    private static String getMaxLengthWord(String[] words) {
        String maxLengthWord = "";
        for (String word : words) {
            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            } else if (word.length() == maxLengthWord.length() && maxLengthWord.compareTo(word) > 0) {
                maxLengthWord = word;
            }
        }
        return maxLengthWord;
    }
}
```

This Java program reads a line from standard input, splits it into words, and then processes the words to find the one with the maximum frequency and the one with the maximum length. Note that in case of a tie, the word that comes first in lexicographical order will be chosen. This mimics the behavior of the `max` function in Python when multiple values have the same comparison result.

To test the program with the given input:

Test input:
`Thank you for your mail and your lectures`

Expected output (in the console):
`your lectures`

When you run this Java code, it will provide the expected output for the given test case.
