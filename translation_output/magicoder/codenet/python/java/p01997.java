<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```

@@ Response
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

This Java code does the same thing as the Python code. It reads two floating-point numbers from the user, calculates the volume of a sphere with the second number as the radius, and then prints the result with 10 decimal places of precision.<｜end▁of▁sentence｜>
