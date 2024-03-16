Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
    
r = float(input())
    
s = r * r * math.pi
    
l = r * 2 * math.pi
    
print('%.5f %.5f' % (s, l))
```

### Response:
```java
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double s = Math.pow(r, 2) * Math.PI;
        double l = 2 * Math.PI * r;
        System.out.printf("%.5f %.5f", s, l);
    }
}
```<|endoftext|>
