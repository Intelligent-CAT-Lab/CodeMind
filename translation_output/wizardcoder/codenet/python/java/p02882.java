Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,x = map(int,input().split())

import math

# ans =math.degrees(math.atan(a*(b**2)/(2*x)))
h = x/a**2


if h>=b/2:
    V = 2*((a**2)*b - x)/a**3
    ans = math.degrees(math.atan(V))
else:
    V=a*(b**2)/(2*x)
    ans =math.degrees(math.atan(V))

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        double h = (double) x / Math.pow(a, 2);

        if (h >= b / 2) {
            double V = 2 * ((Math.pow(a, 2) * b) - x) / Math.pow(a, 3);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        } else {
            double V = a * Math.pow(b, 2) / (2 * x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}
```<|endoftext|>
