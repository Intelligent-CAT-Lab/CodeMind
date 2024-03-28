<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9 12

Expected output:
21


```
a,b = map(int,input().split())

print((a + b) % 24)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println((a + b) % 24);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, adds them together, and then outputs the result modulo 24.<｜end▁of▁sentence｜>
