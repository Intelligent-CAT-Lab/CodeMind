<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = countOccurrences(input, "WB") + countOccurrences(input, "BW");
        System.out.println(count);
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

This Java code reads a string from the user, counts the number of occurrences of "WB" and "BW" in the string, and prints the total count. The `countOccurrences` method is a helper method that counts the number of occurrences of a substring in a string.
<|EOT|>
