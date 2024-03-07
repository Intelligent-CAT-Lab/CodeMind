<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;

public class Koch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        koch(N, a, b);
        b.print();
    }

    public static void koch(int d, Vector a, Vector b) {
        if (d == 0) {
            return;
        }

        Vector s = a.add(b.sub(a).rot(60));
        Vector u = s.add(s.sub(a).rot(60));
        Vector t = b.sub(a).mul(2).div(3).add(a);

        koch(d - 1, a, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, b);
    }

    public static class Vector {
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
}</s>
