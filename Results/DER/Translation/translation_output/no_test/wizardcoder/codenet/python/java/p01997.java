Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(B, 3);
        System.out.printf("%.10f", volume);
    }
}
```<|endoftext|>
