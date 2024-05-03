```python
import math

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def det(self, p):
        return self.x * p.y - self.y * p.x

    def dot(self, p):
        return self.x * p.x + self.y * p.y

    def sub(self, p):
        return Point(self.x - p.x, self.y - p.y)

    def add(self, p):
        return Point(self.x + p.x, self.y + p.y)

    def multiply(self, d):
        return Point(self.x * d, self.y * d)

def line_intersection(p1, p2, q1, q2):
    a = (q2.sub(q1)).det(q1.sub(p1))
    b = (q2.sub(q1)).det(p2.sub(p1))
    return p1.add((p2.sub(p1)).multiply(a / b))

def on_segment(a, b, p):
    if abs(a.x - b.x) < 1e-8:
        return min(a.y, b.y) <= p.y and p.y <= max(a.y, b.y)
    alpha = (b.y - a.y) / (b.x - a.x)
    beta = a.y - alpha * a.x
    return abs(p.y - (alpha * p.x + beta)) < 1e-8 and min(a.x, b.x) <= p.x and p.x <= max(a.x, b.x)

class Task:
    def solve(self, inp, out):
        N = inp.nextInt()
        K = inp.nextInt()
        a = Point(1.0, 0.0)
        b = Point(math.cos(math.pi * 2 / N), math.sin(math.pi * 2 / N))
        pa = Point(math.cos
