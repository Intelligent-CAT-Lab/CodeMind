<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = countOccurrences(input, "WB") + countOccurrences(input, "BW");
        System.out.println(count);
    }

    public static int countOccurrences(String haystack, String needle) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = haystack.indexOf(needle, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += needle.length();
            }
        }

        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of occurrences of "WB" and "BW" in the string, and then prints the total count. The `countOccurrences` method is a helper method that counts the number of occurrences of a substring in a string.<｜end▁of▁sentence｜>
