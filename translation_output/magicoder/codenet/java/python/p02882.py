<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import math

# Water Bottle
A, B, X = map(int, input().split())

if X * 2 >= A * A * B:
    z = (A * A * B - X) / A / A * 2
    d = math.degrees(math.atan(z / A))
else:
    z = X / A / B * 2
    d = math.degrees(math.atan(B / z))

print(d)
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the value of `z` and `d`, and then prints the result. The `math.atan` function is used to calculate the arctangent of a number, and `math.degrees` is used to convert the result from radians to degrees.<｜end▁of▁sentence｜>
