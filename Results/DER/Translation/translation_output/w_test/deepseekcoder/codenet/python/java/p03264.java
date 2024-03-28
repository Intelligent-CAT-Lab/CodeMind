<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int)Math.ceil(k/2) * (k/2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the ceiling of its half, and then multiplies this by the integer division of half of the original number. The result is printed to the standard output.
<|EOT|>
