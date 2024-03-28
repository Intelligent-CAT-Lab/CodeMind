<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 9 0

Expected output:
5.00000000000000000000


```
A,B,H,M = list(map(int,input().split()))

import math

l = H*360/12 + M*30/60
s = M*360/60
ang = abs(l-s)
c = A**2 + B**2 -2*B*A*math.cos(math.radians(ang))
print(math.sqrt(c))
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double l = H*360.0/12 + M*30.0/60;
        double s = M*360.0/60;
        double ang = Math.abs(l-s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.printf("%.20f\n", Math.sqrt(c));
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the lengths of the two hands of a clock, the angle between them, and the length of the hypotenuse of a right triangle with the two other sides being the lengths of the hands. It then prints the length of the hypotenuse, rounded to 20 decimal places.
<|EOT|>
