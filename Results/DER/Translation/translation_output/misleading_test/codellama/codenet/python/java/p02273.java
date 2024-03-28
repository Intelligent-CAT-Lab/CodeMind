<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.lang.Math;

class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(x + " " + y);
    }

    public Vector add(Vector o) {
        return new Vector(x + o.x, y + o.y);
    }

    public Vector sub(Vector o) {
        return new Vector(x - o.x, y - o.y);
    }

    public Vector mul(double o) {
        return new Vector(x * o, y * o);
    }

    public Vector div(double o) {
        return new Vector(x / o, y / o);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}

class Koch {
    public static void koch(int d, Vector a, Vector b) {
        if (d == 0) {
            return;
        }

        Vector s = a.add(b.sub(a).div(3));
        Vector u = s.add(s.sub(a).rot(60));
        Vector t = a.add(b.sub(a).mul(2).div(3));

        koch(d - 1, a, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, b);
    }
}

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        Koch.koch(N, a, b);
        b.print();
    }
}
```
Note: The code is written in Java 8, and it uses the `Math` class to perform mathematical operations. The `Vector` class is used to represent a 2D vector, and it has methods for adding, subtracting, multiplying, and dividing vectors, as well as for rotating them. The `Koch` class is used to implement the Koch curve algorithm, and it has a `koch` method that takes three parameters: the depth of the recursion, the starting point of the curve, and the ending point of the curve. The `main` method is used to test the `Koch` class by creating a Koch curve with a depth of 3 and printing the resulting points.</s>
