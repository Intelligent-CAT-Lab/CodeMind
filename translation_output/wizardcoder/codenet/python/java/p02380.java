Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = Math.sin(Math.toRadians(c));
        double area = 0.5 * a * b * s;
        double perimeter = a + b + Math.sqrt(a*a + b*b - 2*a*b*s);
        double height = b * s;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(height);
    }
}
```<|endoftext|>
