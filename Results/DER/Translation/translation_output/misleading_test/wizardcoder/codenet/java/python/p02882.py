Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

def water_bottle(A, B, X):
    if X * 2 >= A * A * B:
        z = (A * A * B - X) / (A * A) * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = X / (A * B) * 2
        d = math.atan(B / z) * 180 / math.pi
    return d

A, B, X = map(int, input().split())
print(water_bottle(A, B, X))
```

Explanation:

We can use the `math` module in Python to calculate the arctangent function. The `water_bottle` function takes in the values of `A`, `B`, and `X` as input and returns the angle of the water bottle in degrees. 

We first check if `X * 2 >= A * A * B`. If this condition is true, then we can use the formula `z = (A * A * B - X) / A / A * 2` to calculate the height of the water bottle. We then use the `atan` function from the `math` module to calculate the angle of the water bottle in radians, and convert it to degrees.

If the condition is false, then we can use the formula `z = X / A / B * 2` to calculate the height of the water bottle. We then use the `atan` function from the `math` module to calculate the angle of the water bottle in radians, and convert it to degrees.

Finally, we return the angle of the water bottle in degrees.<|endoftext|>
