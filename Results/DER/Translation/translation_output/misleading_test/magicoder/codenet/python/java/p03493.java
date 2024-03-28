<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
101

Expected output:
67

```
print(input().count('1'))
```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = countOccurrences(input, '1');
        System.out.println(count);
    }

    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code reads a line of input from the user, counts the number of '1' characters in the input string, and then prints the count. The `countOccurrences` method is a helper method that counts the number of occurrences of a specific character in a string.<｜end▁of▁sentence｜>
