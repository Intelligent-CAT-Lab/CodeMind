<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double h = (double) x / (a * a);

        double ans;
        if (h >= b / 2) {
            double V = 2 * ((a * a) * b - x) / (a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = (double) a * (b * b) / (2 * x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the value of `h`, and then calculates the value of `ans` based on the value of `h`. Finally, it prints the value of `ans`.<｜end▁of▁sentence｜>
