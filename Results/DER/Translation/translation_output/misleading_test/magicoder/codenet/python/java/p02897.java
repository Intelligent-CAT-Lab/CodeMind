<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-15.97688597978339

```
N = int(input())
print(-(-N//2)/N)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-((double)(-N/2))/N);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the result, and prints it. The `-((double)(-N/2))/N` part is equivalent to the Python code `-(-N//2)/N`. The `-` operator in Java is used for unary negation, and `//` is the integer division operator. The `(double)` is used to cast the result of `-N/2` to a double, so that the division operation can be performed.<｜end▁of▁sentence｜>
