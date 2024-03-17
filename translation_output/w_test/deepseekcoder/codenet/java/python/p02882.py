<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

def main():
    A, B, X = map(int, input().split())

    d = 0
    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.degrees(math.atan(z / A))
    else:
        z = X / A / B * 2
        d = math.degrees(math.atan(B / z))

    print(d)

if __name__ == "__main__":
    main()
```
<|EOT|>
