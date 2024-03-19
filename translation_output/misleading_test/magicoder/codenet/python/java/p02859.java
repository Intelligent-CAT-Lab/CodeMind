<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
87

```
r = int(input())
print(r**2)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println((int) Math.pow(r, 2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, squares it, and then prints the result. The `Math.pow` function is used to square the number, and the result is cast to an integer before printing.<｜end▁of▁sentence｜>
