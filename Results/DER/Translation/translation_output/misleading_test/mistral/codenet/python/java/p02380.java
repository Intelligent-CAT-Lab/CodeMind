<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.0
12.0
3.0
-95.7365573548486

```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double result1 = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double result2 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        double result3 = b * Math.sin(Math.toRadians(c));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```</s>
