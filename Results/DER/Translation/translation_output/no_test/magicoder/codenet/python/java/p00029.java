<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");

        Map<String, Integer> countMap = new HashMap<>();
        for (String s : a) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        String maxCountWord = Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length());
        String maxLengthWord = a[0];

        System.out.println(maxCountWord + " " + maxLengthWord);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into words, and then finds the word with the maximum count and the word with the maximum length. It uses a HashMap to count the occurrences of each word, and then sorts the array of words by length in descending order.<｜end▁of▁sentence｜>
