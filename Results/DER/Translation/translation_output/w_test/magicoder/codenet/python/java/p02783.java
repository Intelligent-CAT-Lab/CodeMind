<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
3


```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        scanner.close();

        System.out.println((int) Math.ceil((double) H / A));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the ceiling of the division of the first integer by the second one, and then prints the result. The `Math.ceil` function is used to round up the result to the nearest integer. The `(double)` cast is used to ensure that the division operation results in a floating-point number, which is then passed to `Math.ceil`.<｜end▁of▁sentence｜>
