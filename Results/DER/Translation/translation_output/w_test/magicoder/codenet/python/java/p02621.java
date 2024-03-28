<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
a = int(input())
print(a + a ** 2 + a ** 3)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + a * a + a * a * a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the expression `a + a^2 + a^3`, and then prints the result.<｜end▁of▁sentence｜>
