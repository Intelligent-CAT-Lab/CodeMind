<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        double h = x / (double) a * a;
        double V;

        if (h >= b / 2) {
            V = 2 * (a * b - x) / (a * a * a);
        } else {
            V = a * (b * b) / (2 * x);
        }

        double ans = Math.toDegrees(Math.atan(V));
        System.out.println(ans);
    }
}
```
Note that in Java, we need to use the `double` data type for the variables `h` and `V` to avoid integer division, which would result in incorrect values. We also need to use the `Math.toDegrees()` method to convert the angle from radians to degrees.</s>
