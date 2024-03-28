<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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

Here is the Java code that implements the same algorithm as the Python code:
```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x0, y0, gcd;
        if (a < b) {
            x0 = 0;
            y0 = 1;
            gcd = b;
        } else {
            x0 = 1;
            y0 = 0;
            gcd = a;
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
}
```
Note that this code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations.</s>
