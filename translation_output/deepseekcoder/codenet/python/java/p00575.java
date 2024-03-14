<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        float a = (float) Math.ceil(C / A);

        float s = 7 * A + B;
        float t = (float) (C / s);
        //sã¯1é±éã«ããããã³ã¤ã³ã®ææ°
        float u = C - s * t;
        //uã¯ç«¯æ°
        float v = (float) Math.ceil(u / A);

        float b;
        if (v <= 7) {
            b = 7 * t + v;
        } else {
            b = 7 * t + 7;
        }

        if (a > b) {
            System.out.println((int) b);
        } else {
            System.out.println((int) a);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three float numbers from the standard input, calculates some values based on these numbers, and then prints the smallest of the calculated values.
<|EOT|>
