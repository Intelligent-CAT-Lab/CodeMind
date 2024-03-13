<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        int a = (int) Math.ceil(C / A);

        float s = 7 * A + B;
        int t = (int) Math.floor(C / s);
        float u = C - s * t;
        int v = (int) Math.ceil(u / A);

        int b;
        if (v <= 7) {
            b = 7 * t + v;
        } else {
            b = 7 * t + 7;
        }

        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads three floating-point numbers from the user, calculates some values based on these numbers, and then prints the smaller of the two calculated values.<｜end▁of▁sentence｜>
