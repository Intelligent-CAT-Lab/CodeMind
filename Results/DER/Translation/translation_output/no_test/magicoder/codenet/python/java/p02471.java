<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-
from __future__ import print_function


def rec(a, b):
    """a * x + b * y = gcd(a, b) ??Â¨??????????????? (x, y, gcd) ?????????"""
    assert a >= b
    q, r = divmod(a, b)
    if r == 0:
        return 0, 1, b
    x, y, gcd = rec(b, r)
    # a = b * q + r
    # b * x + r * y = gcd
    # a * y + b * (x - q * y) = gcd
    return y, x - q * y, gcd


a, b = [int(_) for _ in raw_input().split()]

if a < b:
    y0, x0, gcd = rec(b, a)
else:
    x0, y0, gcd = rec(a, b)

# -a/gcd * (x - x0) = b/gcd * (y - y0)
# x = x0 + (b/gcd) * k, y = y0 + (-a/gcd) * k
dx = b // gcd
dy = -a // gcd
if dx < 0:
    dx = -dx
    dy = -dy
x = x0
y = y0
mag = abs(x) + abs(y)

while True:
    x1 = x + dx
    y1 = y + dy
    mag1 = abs(x1) + abs(y1)
    if mag1 >= mag:
        break
    mag = mag1
    x = x1
    y = y1

while True:
    x1 = x - dx
    y1 = y - dy
    mag1 = abs(x1) + abs(y1)
    if mag1 > mag:
        break
    mag = mag1
    x = x1
    y = y1

print(x, y)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x0, y0, gcd;
        if (a < b) {
            int[] result = rec(b, a);
            x0 = result[0];
            y0 = result[1];
            gcd = result[2];
        } else {
            int[] result = rec(a, b);
            x0 = result[0];
            y0 = result[1];
            gcd = result[2];
        }

        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }

        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);

        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        System.out.println(x + " " + y);
    }

    private static int[] rec(int a, int b) {
        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[]{0, 1, b};
        }
        int[] result = rec(b, r);
        int x = result[0];
        int y = result[1];
        int gcd = result[2];
        return new int[]{y, x - q * y, gcd};
    }
}
```

This Java code does the same thing as the Python code. It uses the Euclidean algorithm to find the greatest common divisor (gcd) of two numbers, and then uses this gcd to find the smallest positive integer solution to the equation `a * x + b * y = gcd`. It then finds the smallest positive integer solution to the equation `a * x + b * y = -gcd`. The solution with the smallest magnitude is printed.<｜end▁of▁sentence｜>
