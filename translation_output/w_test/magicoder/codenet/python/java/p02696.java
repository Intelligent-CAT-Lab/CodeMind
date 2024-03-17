<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        System.out.println((int)Math.floor(A * Math.min(B - 1, N) / B));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the minimum between `B - 1` and `N`, multiplies it by `A`, and then divides the result by `B`. The result is then rounded down to the nearest integer using `Math.floor()`.<｜end▁of▁sentence｜>
