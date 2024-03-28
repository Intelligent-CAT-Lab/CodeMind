<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B;
        A = sc.nextDouble();
        B = sc.nextDouble();
        System.out.printf("%.10f", (4.0/3.0)*Math.PI*Math.pow(B, 3));
    }
}
```</s>
