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
    EPS = 2e-8
    if abs(a.x - b.x) < EPS:
        return min(a.y, b.y) <= p.y and p.y <= max(a.y, b.y)
    alpha = (b.y - a.y) / (b.x - a.x)
    beta = a.y - alpha * a.x
    return abs(p.y - (alpha * p.x + beta)) < EPS and min(a.x, b.x) <= p.x <= max(a.x, b.x)


def solve(N, K):
    a = Point(1.0, 0.0)
    b = Point(math.cos(math.pi * 2 / N), math.sin(math.pi * 2 / N))
    pa = Point(math.cos(math.pi * 2 / N * K), math.sin(math.pi * 2 / N * K))
    pb = Point(math.cos(math.pi * 2 / N * (1 - K)), math.sin(math.pi * 2 / N * (1 - K))

    intersection = line_intersection(a, pa, b, pb)
    ai = a.sub(intersection)
    bi = b.sub(intersection)
    S = abs(ai.det(bi)) / 2
    convex = abs(a.det(b)) / 2 * N
    return convex - S * N


if __name__ == '__main__':
    N, K = map(int, input().split())
    result = solve(N, K)
    print(result)
```
In the provided solution, the Java code has been translated into Python. The main logic remains the same, and the required calculations are performed using the Point class and relevant methods in Python. The solve function takes the inputs N and K, performs the necessary calculations, and returns the result. Finally, the result is printed to the console.
