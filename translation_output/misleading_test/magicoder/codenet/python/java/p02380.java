<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.println(a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the area of the triangle and prints it. Then it calculates the length of the hypotenuse of the triangle and prints it. Finally, it calculates the height of the triangle and prints it.<｜end▁of▁sentence｜>
