<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.printf("%.10f", 4.0/3.0*PI*Math.pow(B, 3));
    }
}
```
<|EOT|>
