<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] result;
        if (a < b) {
            result = rec(b, a);
        } else {
            result = rec(a, b);
        }

        int dx = b / result[2];
        int dy = -a / result[2];
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }

        int x = result[1];
        int y = result[0];
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
        int[] arr = rec(b, r);
        return new int[]{arr[1], arr[0] - q * arr[1], arr[2]};
    }
}
```

This Java code does the same thing as your Python code. It calculates the greatest common divisor (gcd) of two numbers using the Euclidean algorithm, and then finds the smallest positive integer solution to the equation `ax + by = gcd(a, b)`. The code then adjusts the solution to the equation `x = x0 + (b/gcd) * k` and `y = y0 + (-a/gcd) * k`, where `(x0, y0)` is the original solution, and `k` is an integer. The code then finds the smallest positive integer solution to the equation `ax + by = gcd(a, b)` that is not more than `(x, y)`.
<|EOT|>
