<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr


```
s = input()
print(s[::2])
```

@@ Response
Here is the Java version of the Python code:

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

This Java code reads a string from the standard input, and then prints every second character of the string. The `StringBuilder` class is used to efficiently build the result string, as it allows for efficient string concatenation.<｜end▁of▁sentence｜>
