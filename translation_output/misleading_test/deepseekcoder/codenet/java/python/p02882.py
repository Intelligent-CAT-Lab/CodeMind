<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2 4

Expected output:
83.82329779497354

```
import java.util.Scanner;

/**
 * Water Bottle
 */
public class p02882 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            double d;
            if (X * 2 >= A * A * B) {
                double z = (double) (A * A * B - X) / A / A * 2;
                d = Math.atan(z / A) * 180 / Math.PI;
            } else {
                double z = (double) (X) / A / B * 2;
                d = Math.atan(B / z) * 180 / Math.PI;
            }

            System.out.println(d);
        }
    }

}

```

### Response:
```python
import math

def water_bottle():
    A, B, X = map(int, input().split())

    d = 0
    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.degrees(math.atan(z / A))
    else:
        z = X / A / B * 2
        d = math.degrees(math.atan(B / z))

    print(d)

water_bottle()
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the angle `d` based on the given conditions, and prints the result. The `math.atan` function in Python returns the arc tangent of the specified value, and `math.degrees` function converts the angle from radians to degrees.
<|EOT|>
