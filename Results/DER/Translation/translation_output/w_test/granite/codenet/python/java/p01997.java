System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
33.510322


```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double result = 4.0/3.0 * Math.PI * Math.pow(B, 3);
        System.out.println(String.format("%.10f", result));
    }
}
```

Test input:
```
1 2
```

Expected output:
```
33.510322
```<|endoftext|>
