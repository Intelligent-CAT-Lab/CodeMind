<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 4

Expected output:
89.30459144318536

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x;
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        double h = x / (double) a ** 2;
        if (h >= b / 2) {
            double V = 2 * ((a ** 2) * b - x) / (a ** 3);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        } else {
            double V = a * (b ** 2) / (2 * x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}
```</s>
