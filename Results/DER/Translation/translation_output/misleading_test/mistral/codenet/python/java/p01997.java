<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-9.705594240372378

```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        double result = (4.0 / 3.0) * Math.PI * Math.pow(B, 3);
        System.out.printf("%.10f", result);
    }
}
```</s>
