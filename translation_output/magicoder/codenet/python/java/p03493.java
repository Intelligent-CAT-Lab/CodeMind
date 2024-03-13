<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print(input().count('1'))
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = countChar(input, '1');
        System.out.println(count);
    }

    public static int countChar(String str, char ch) {
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

This Java code does the same thing as the Python code. It reads a line of input from the user, counts the number of '1' characters in the input, and then prints the count. The `countChar` method is a helper method that counts the number of occurrences of a specific character in a string.<｜end▁of▁sentence｜>
