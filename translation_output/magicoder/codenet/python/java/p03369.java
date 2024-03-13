<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(700+100*s.count("o"))
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = countOccurrences(s, 'o');
        System.out.println(700 + 100 * count);
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

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of 'o' characters in the string, and then prints the result of the calculation `700 + 100 * count`. The `countOccurrences` method is used to count the number of occurrences of a character in a string.<｜end▁of▁sentence｜>
