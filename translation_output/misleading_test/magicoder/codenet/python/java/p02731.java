<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-29.561930693928545

```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        double hen = L / 3.0;
        System.out.println(Math.pow(hen, 3));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, divides it by 3, and then calculates the cube of the result. The `Math.pow` function is used to calculate the cube, and `3.0` is used to ensure that the division operation results in a double.<｜end▁of▁sentence｜>
