<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double a = Math.ceil(C / A);
        double s = 7 * A + B;
        double t = Math.floor(C / s);
        double u = C - s * t;
        double v = Math.ceil(u / A);

        if (v <= 7) {
            double b = 7 * t + v;
        } else {
            double b = 7 * t + 7;
        }

        if (a > b) {
            System.out.println((int) b);
        } else {
            System.out.println((int) a);
        }
    }
}
```
Note that in Java, we use the `Math` class to perform mathematical operations, and we use the `Scanner` class to read input from the user. We also use the `System.out.println()` method to print the output to the console.</s>
