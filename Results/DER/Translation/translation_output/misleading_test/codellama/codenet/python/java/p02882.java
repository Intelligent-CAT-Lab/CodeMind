<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        double h = x / (double) (a * a);
        double V;

        if (h >= b / 2) {
            V = 2 * ((a * a) * b - x) / (a * a * a);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        } else {
            V = a * (b * b) / (2 * x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}
```
Note: The `Math.toDegrees()` method is used to convert the angle from radians to degrees.</s>
