<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
VdZ10~40A3YLI\M=,^0!l
33.3333333 0.00000000
50.00000000 28.8651346
66.66666667 0.P00000000
10.00000000 0.00000000

```
import math


class Vector():
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print(self.x, self.y)

    def __add__(self, o):
        return Vector(self.x + o.x, self.y + o.y)

    def __sub__(self, o):
        return Vector(self.x - o.x, self.y - o.y)

    def __mul__(self, o):
        return Vector(self.x * o, self.y * o)

    def __truediv__(self, o):
        return Vector(self.x / o, self.y / o)

    def rot(self, deg):
        rad = math.radians(deg)
        x = self.x * math.cos(rad) - self.y * math.sin(rad)
        y = self.x * math.sin(rad) + self.y * math.cos(rad)
        return Vector(x, y)


def koch(d, a, b):
    if d == 0:
        return

    s = a + (b-a)/3
    u = s + (s-a).rot(60)
    t = a + (b-a)*2/3

    koch(d-1, a, s)
    s.print()
    koch(d-1, s, u)
    u.print()
    koch(d-1, u, t)
    t.print()
    koch(d-1, t, b)


N = int(input())

a = Vector(0, 0)
b = Vector(100, 0)


a.print()
koch(N, a, b)
b.print()


```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

class Vector {
    double x, y;

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(this.x + " " + this.y);
    }

    Vector add(Vector o) {
        return new Vector(this.x + o.x, this.y + o.y);
    }

    Vector sub(Vector o) {
        return new Vector(this.x - o.x, this.y - o.y);
    }

    Vector mul(double o) {
        return new Vector(this.x * o, this.y * o);
    }

    Vector div(double o) {
        return new Vector(this.x / o, this.y / o);
    }

    Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}

public class Main {
    static void koch(int d, Vector a, Vector b) {
        if (d == 0)
            return;

        Vector s = a.add(b.sub(a).div(3));
        Vector u = s.add(s.sub(a).rot(60));
        Vector t = a.add(b.sub(a).mul(2).div(3));

        koch(d-1, a, s);
        s.print();
        koch(d-1, s, u);
        u.print();
        koch(d-1, u, t);
        t.print();
        koch(d-1, t, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        koch(N, a, b);
        b.print();

        scanner.close();
    }
}
```

This Java code does the same thing as the Python code. It defines a `Vector` class with methods for addition, subtraction, multiplication, division, and rotation, and a `koch` function that recursively generates a Koch curve. The `main` function reads the input depth `N`, creates two vectors `a` and `b`, and calls `koch` with `a` and `b` as arguments.
<|EOT|>
