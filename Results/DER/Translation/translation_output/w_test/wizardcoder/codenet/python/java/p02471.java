Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            int y0, x0, gcd;
            y0 = x0 = gcd = 0;
            gcd = b;
            while (true) {
                int q = a / gcd;
                int r = a % gcd;
                if (r == 0) {
                    break;
                }
                int y, x;
                y = x = 0;
                y = x0;
                x = y0 - q * x0;
                a = gcd;
                b = r;
                x0 = x;
                y0 = y;
                gcd = r;
            }
            System.out.println(x0 + " " + y0);
        } else {
            int x0, y0, gcd;
            x0 = y0 = gcd = 0;
            gcd = a;
            while (true) {
                int q = b / gcd;
                int r = b % gcd;
                if (r == 0) {
                    break;
                }
                int y, x;
                y = x = 0;
                y = y0 - q * y0;
                x = x0 + q * y0;
                a = gcd;
                b = r;
                x0 = x;
                y0 = y;
                gcd = r;
            }
            System.out.println(x0 + " " + y0);
        }
    }
}
```<|endoftext|>
