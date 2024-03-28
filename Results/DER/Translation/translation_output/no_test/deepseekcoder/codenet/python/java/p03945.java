<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(countOccurrences(input, "WB") + countOccurrences(input, "BW"));
    }

    public static int countOccurrences(String str, String sub) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(sub, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += sub.length();
            }
        }

        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the occurrences of the strings "WB" and "BW" in the input string, and prints the sum of these counts. The `countOccurrences` method is a helper method that counts the occurrences of a substring in a string.
<|EOT|>
