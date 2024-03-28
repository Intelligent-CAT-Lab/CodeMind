<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        double hen = (double) L / 3;
        System.out.println(Math.pow(hen, 3));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, divides it by 3 to get the value of `hen`, and then prints the cube of `hen` to the standard output.
<|EOT|>
