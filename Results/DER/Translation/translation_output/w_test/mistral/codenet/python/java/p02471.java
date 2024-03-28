<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12

Expected output:
1 0


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
[/INST]
```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = findGCD(a, b);
        int x = findX(a, b, gcd);
        int y = findY(a, b, gcd);
        System.out.println(x + " " + y);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findX(int a, int b, int gcd) {
        int x0 = findX(b, a % b, gcd);
        if (a < b) {
            return x0;
        }
        return findX(a, b, gcd);
    }

    public static int findX(int b, int r, int gcd) {
        int q = r / b;
        int x = q * b - r;
        if (x < 0) {
            x += b;
        }
        return x;
    }

    public static int findY(int a, int b, int gcd) {
        int y0 = findY(b, a % b, gcd);
        if (a < b) {
            return y0;
        }
        return findY(a, b, gcd);
    }

    public static int findY(int b, int r, int gcd) {
        int q = r / b;
        int y = -q * b + r;
        if (y < 0) {
            y += b;
        }
        return y;
    }
}
```</s>
