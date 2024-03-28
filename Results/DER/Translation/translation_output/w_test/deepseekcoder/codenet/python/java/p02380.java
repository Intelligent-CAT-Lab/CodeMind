<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.00000000
12.00000000
3.00000000


```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double radians = Math.toRadians(c);
        System.out.printf("%.8f\n", 0.5*a*b*Math.sin(radians));
        System.out.printf("%.8f\n", a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(radians)));
        System.out.printf("%.8f\n", b*Math.sin(radians));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the area of the triangle and prints it, calculates the length of the hypotenuse and prints it, and calculates the length of the side of the triangle and prints it. The output is formatted to 8 decimal places.
<|EOT|>
