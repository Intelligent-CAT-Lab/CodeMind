<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
2


```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int)Math.ceil(k/2.0) * (k/2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the ceiling of half of the integer, and then multiplies the result by half of the integer. The `Math.ceil()` function is used to round up to the nearest integer, and the `/` operator performs integer division. The `.0` after `k/2` is used to force the division to be a floating point division, so that the result of `k/2` is a floating point number.<｜end▁of▁sentence｜>
