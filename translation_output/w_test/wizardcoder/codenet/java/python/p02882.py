Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2 4

Expected output:
45.0000000000


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
print("{:.10f}".format(water_bottle(A, B, X)))
```

Explanation:

We first import the math module to use the `atan` function. We define a function `water_bottle` that takes in three parameters `A`, `B`, and `X`. 

Inside the function, we first check if `X * 2 >= A * A * B`. If this condition is true, then we calculate the height `z` of the water bottle using the formula `z = (A * A * B - X) / A / A * 2`. We then calculate the angle `d` using the formula `d = atan(z / A) * 180 / pi`.

If the condition is false, then we calculate the height `z` of the water bottle using the formula `z = X / A / B * 2`. We then calculate the angle `d` using the formula `d = atan(B / z) * 180 / pi`.

Finally, we return the value of `d`.

In the main function, we use a try-with-resources block to read in the input from the user. We then call the `water_bottle` function with the input values and print the result to the console. We use the `"{:.10f}"` format specifier to print the result with 10 decimal places.<|endoftext|>
