<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
101

Expected output:
2


```
print(input().count('1'))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = countOccurrences(input, '1');
        System.out.println(count);
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
```

This Java program reads an integer as a string from the user, counts the number of '1's in the string, and prints the count. The `countOccurrences` method is a helper method that counts the number of occurrences of a specific character in a string.
<|EOT|>
