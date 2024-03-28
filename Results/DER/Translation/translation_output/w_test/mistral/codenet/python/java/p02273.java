<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
0.00000000 0.00000000
33.33333333 0.00000000
50.00000000 28.86751346
66.66666667 0.00000000
100.00000000 0.00000000


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
import java.util.Scanner;

class Vector {
    private double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("%.12f, %.12f%n", x, y);
    }

    public Vector add(Vector o) {
        return new Vector(x + o.x, y + o.y);
    }

    public Vector sub(Vector o) {
        return new Vector(x - o.x, y - o.y);
    }

    public Vector mul(Vector o) {
        return new Vector(x * o.x, y * o.y);
    }

    public Vector truediv(Vector o) {
        return new Vector(x / o.x, y / o.y);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = x * Math.cos(rad) - y * Math.sin(rad);
        double y = x * Math.sin(rad) + y * Math.cos(rad);
        return new Vector(x, y);
    }
}

public class KochSnowflake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        koch(N, a, b);
        b.print();
    }

    public static void koch(int N, Vector a, Vector b) {
        if (N == 0) {
            return;
        }

        Vector s = a.add(b.sub(a));
        Vector u = s.add(s.sub(a).rot(Math.toRadians(60)));
        Vector t = a.add(b.sub(a).mul(2).div(3));

        koch(N - 1, a, s);
        s.print();
        koch(N - 1, s, u);
        u.print();
        koch(N - 1, u, t);
        t.print();
        koch(N - 1, t, b);
    }
}
```</s>
