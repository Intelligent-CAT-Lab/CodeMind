<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(700+100*s.count("o"))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = countOccurrences(s, "o");
        System.out.println(700 + 100 * count);
    }

    public static int countOccurrences(String s, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = s.indexOf(sub, idx)) != -1) {
            count++;
            idx++;
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of occurrences of the character "o" in the string, and then prints the result of the calculation `700 + 100 * count`.

The `countOccurrences` method is a helper method that counts the number of occurrences of a substring in a string. It uses the `indexOf` method of the `String` class, which returns the index of the first occurrence of the specified substring, or -1 if the substring is not found. The method continues to search from the index of the last found occurrence plus one, until it no longer finds the substring.
<|EOT|>
