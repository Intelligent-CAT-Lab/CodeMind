<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-9.705594240372378

```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double result = 4.0/3.0 * Math.PI * Math.pow(B, 3);
        System.out.printf("%.10f", result);
    }
}
```

This Java code does the same thing as the Python code. It reads two floating-point numbers from the input, calculates the volume of a sphere with radius B and prints the result. The volume of a sphere is calculated using the formula `4/3*pi*r^3`. The result is formatted to 10 decimal places.
<|EOT|>
