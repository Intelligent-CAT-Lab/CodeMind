<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
print(len(s)//2-s.count('p'))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = (int) Math.floor(s.length() / 2.0) - countChar(s, 'p');
        System.out.println(count);
    }

    public static int countChar(String s, char c) {
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

This Java code does the same thing as the Python code. It reads a string from the user, calculates the number of characters in the string divided by 2, and then subtracts the number of 'p' characters in the string. The `countChar` method is used to count the number of occurrences of a specific character in the string.<｜end▁of▁sentence｜>
