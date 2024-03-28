Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

def water_bottle():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / (A * A) * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = X / (A * B) * 2
        d = math.atan(B / z) * 180 / math.pi

    print(d)

water_bottle()
```

Explanation:

- We first import the `math` module to use the `atan` function.
- We define a function `water_bottle` that takes no arguments.
- We use the `input` function to get the values of `A`, `B`, and `X` from the user.
- We use an `if-else` statement to determine which formula to use based on the value of `X`.
- We calculate the value of `z` using the formula given in the problem statement.
- We use the `atan` function to calculate the angle `d` in degrees.
- We print the value of `d` to the console.<|endoftext|>
