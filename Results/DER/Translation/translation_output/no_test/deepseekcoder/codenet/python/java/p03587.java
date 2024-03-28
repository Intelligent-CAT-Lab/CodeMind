<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s.count("1"))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = countOccurrences(s, "1");
        System.out.println(count);
    }

    public static int countOccurrences(String s, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = s.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, counts the number of occurrences of the string "1" in the input, and prints the count. The `countOccurrences` method is a helper method that uses the `indexOf` method of the `String` class to find the next occurrence of the specified substring in the string.
<|EOT|>
