<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[::2])
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }

        System.out.println(result.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, and then prints every other character of the string.<｜end▁of▁sentence｜>
