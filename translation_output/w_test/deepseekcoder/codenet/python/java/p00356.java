<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
5


```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b - gcd(a, b) + 1);
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

This Java code does the same thing as the Python code. It reads two integers from the input, calculates their sum and difference, and then subtracts the greatest common divisor (gcd) of the two numbers. The gcd is calculated using the Euclidean algorithm. The result is then printed to the standard output.
<|EOT|>
