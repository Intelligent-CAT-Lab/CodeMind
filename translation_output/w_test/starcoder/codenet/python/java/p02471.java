<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12

Expected output:
1 0


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
        int x = 0, y = 1, gcd = 0;
        if (a < b) {
            int q = a / b;
            int r = a % b;
            x = q;
            y = 1;
            gcd = b;
        } else {
            int q = b / a;
            int r = b % a;
            x = 1;
            y = q;
            gcd = a;
        }
        while (r!= 0) {
            int q = a / b;
            int r = a % b;
            int x1 = y;
            int y1 = x - q * y;
            int gcd1 = b;
            a = b;
            b = r;
            x = x1;
            y = y1;
            gcd = gcd1;
        }
        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x1 = x + dx;
        int y1 = y + dy;
        int mag = Math.abs(x1) + Math.abs(y1);
        while (true) {
            int x2 = x1 + dx;
            int y2 = y1 + dy;
            int mag1 = Math.abs(x2) + Math.abs(y2);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x1 = x2;
            y1 = y2;
        }
        while (true) {
            int x2 = x1 - dx;
            int y2 = y1 - dy;
            int mag1 = Math.abs(x2) + Math.abs(y2);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x1 = x2;
            y1 = y2;
        }
        System.out.println(x1 + " " + y1);
    }
}
```

'''
<|endoftext|>
