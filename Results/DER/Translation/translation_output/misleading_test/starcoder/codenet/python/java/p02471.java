<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12

Expected output:
1 0 -22

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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x0 = 0, y0 = 1, gcd = 0;
        if (a < b) {
            int q = a / b;
            int r = a % b;
            x0 = y0 = 1;
            gcd = b;
            while (r!= 0) {
                int x1 = y0;
                int y1 = x0 - q * y0;
                int gcd1 = gcd;
                x0 = x1;
                y0 = y1;
                gcd = gcd1;
                q = a / b;
                r = a % b;
            }
        } else {
            int q = b / a;
            int r = b % a;
            x0 = y0 = 1;
            gcd = a;
            while (r!= 0) {
                int x1 = y0;
                int y1 = x0 - q * y0;
                int gcd1 = gcd;
                x0 = x1;
                y0 = y1;
                gcd = gcd1;
                q = b / a;
                r = b % a;
            }
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

'''
<|endoftext|>
