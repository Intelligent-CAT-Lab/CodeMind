<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
6


```
n, m = map(int, input().split())
print((n-1)*(m-1))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the product of `(n-1)` and `(m-1)`, and then prints the result.<｜end▁of▁sentence｜>
