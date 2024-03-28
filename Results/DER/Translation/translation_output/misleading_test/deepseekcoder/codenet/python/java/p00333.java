<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 20 5

Expected output:
49

```
from math import gcd
W, H, C = map(int, input().split())
g = gcd(W, H)
print(W*H*C//(g*g))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        int g = gcd(W, H);
        System.out.println((W * H * C) / (g * g));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the greatest common divisor (gcd) of the first two, and then prints the result of the calculation. The gcd method is a standard Euclidean algorithm for calculating the greatest common divisor of two integers.
<|EOT|>
