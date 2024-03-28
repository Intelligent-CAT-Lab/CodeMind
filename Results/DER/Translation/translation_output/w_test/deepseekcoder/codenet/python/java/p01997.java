<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
33.510322


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
        System.out.printf("%.10f", 4.0/3.0*Math.PI*Math.pow(B, 3));
    }
}
```

This Java code does the same thing as the Python code. It reads two floating-point numbers from the input, calculates the volume of a sphere with radius B and prints the result. The volume of a sphere is calculated using the formula `4/3*pi*r^3`. The `Math.pow(B, 3)` function is used to calculate the cube of B. The `System.out.printf("%.10f", ...)` line is used to print the result with 10 decimal places.
<|EOT|>
