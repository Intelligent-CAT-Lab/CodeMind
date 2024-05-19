System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-
from __future__ import print_function


def rec(a, b):
    """a * x + b * y = gcd(a, b)??Â¨??????????????? (x, y, gcd)?????????"""
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long x = 0, y = 0, gcd = 0;
        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }
        while (b!= 0) {
            long q = a / b;
            long r = a % b;
            a = b;
            b = r;
            long tempX = x;
            x = y;
            y = tempX - q * y;
        }
        gcd = a;
        long dx = b / gcd;
        long dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        x = x % gcd;
        if (x < 0) {
            x += gcd;
        }
        y = (a * x + b * y) / gcd;
        while (true) {
            long x1 = x + dx;
            long y1 = y + dy;
            if (Math.abs(x1) + Math.abs(y1) > Math.abs(x) + Math.abs(y)) {
                break;
            }
            x = x1;
            y = y1;
        }
        while (true) {
            long x1 = x - dx;
            long y1 = y - dy;
            if (Math.abs(x1) + Math.abs(y1) >= Math.abs(x) + Math.abs(y)) {
                break;
            }
            x = x1;
            y = y1;
        }
        System.out.println(x + " " + y);
    }
}
```<|endoftext|>
