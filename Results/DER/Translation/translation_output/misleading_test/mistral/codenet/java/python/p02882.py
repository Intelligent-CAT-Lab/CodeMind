<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import math

def p02882():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = (X) / A / B * 2
        d = math.atan(B / z) * 180 / math.pi

    print(d)

p02882()
```</s>
