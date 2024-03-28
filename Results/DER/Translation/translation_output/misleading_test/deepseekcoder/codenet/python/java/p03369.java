<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
863

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
        String s = scanner.next();
        int count = countOccurrences(s, 'o');
        System.out.println(700 + 100 * count);
    }

    public static int countOccurrences(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code reads a string from the standard input, counts the number of 'o' characters in the string, and then prints the result of the calculation 700 + 100 * count. The function `countOccurrences` is used to count the number of occurrences of a character in a string.
<|EOT|>
