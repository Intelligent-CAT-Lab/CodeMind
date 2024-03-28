<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,H,M = list(map(int,input().split()))

import math

l = H*360/12 + M*30/60
s = M*360/60
ang = abs(l-s)
c = A**2 + B**2 -2*B*A*math.cos(math.radians(ang))
print(math.sqrt(c))
```

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double l = H*360.0/12 + M*30.0/60;
        double s = M*360.0/60;
        double ang = Math.abs(l-s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, calculates the length of the hour and minute hands, calculates the angle between them, and then calculates the length of the hypotenuse of the triangle formed by the two other sides of the triangle.<｜end▁of▁sentence｜>
