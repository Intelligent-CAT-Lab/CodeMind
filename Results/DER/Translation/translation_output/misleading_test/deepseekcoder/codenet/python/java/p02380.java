<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.0
12.0
3.0
-95.7365573548486

```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c))));
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates and prints the area of the triangle, the length of the hypotenuse, and the length of the side of the triangle, respectively. The `Math.toRadians(c)` function is used to convert the angle from degrees to radians, because the `Math.sin` and `Math.cos` functions in Java use radians as input.
<|EOT|>
