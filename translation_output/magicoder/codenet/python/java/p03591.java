<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.startsWith("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, checks if the line starts with the string "YAKI", and prints "Yes" if it does, or "No" if it doesn't.<｜end▁of▁sentence｜>
