<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 0 10

Expected output:
4


```
import math as m
A,B,C=(float(x) for x in input().split())

a=m.ceil(C/A)

s=7*A+B
t=C//s
#sã¯1é±éã«ããããã³ã¤ã³ã®ææ°
u=C-s*t
#uã¯ç«¯æ°
v=m.ceil(u/A)

if v<=7:
    b=7*t+v
    
else:
    b=7*t+7
    
if a>b:
    print(int(b))
else:
    print(int(a))

```
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double a = Math.ceil(C / A);
        double s = 7 * A + B;
        double t = Math.floor(C / s);
        double u = C - s * t;
        double v = Math.ceil(u / A);

        if (v <= 7) {
            double b = 7 * t + v;
            if (a > b) {
                System.out.println((int) b);
            } else {
                System.out.println((int) a);
            }
        } else {
            double b = 7 * t + 7;
            if (a > b) {
                System.out.println((int) b);
            } else {
                System.out.println((int) a);
            }
        }
    }
}
```
Note: The code uses the `Math.ceil()` method to round up the result of the division to the nearest integer, and the `Math.floor()` method to round down the result of the division to the nearest integer. The `Scanner` class is used to read the input from the user.</s>
