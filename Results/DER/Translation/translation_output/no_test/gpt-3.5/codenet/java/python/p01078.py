```python
import math
import sys

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        return Point(self.x + other.x, self.y + other.y)

    def __sub__(self, other):
        return Point(self.x - other.x, self.y - other.y)

    def __mul__(self, scalar):
        return Point(self.x * scalar, self.y * scalar)

    def det(self, other):
        return self.x * other.y - self.y * other.x

def line_intersection(p1, p2, q1, q2):
    a = (q2 - q1).det(q1 - p1)
    b = (q2 -q1).det(p2 - p1)
    return p1 + (p2 - p1) * (a / b)

class Task:
    def solve(self, N, K):
        a = Point(1.0, 0.0)
        b = Point(math.cos(math.pi * 2 / N), math.sin(math.pi * 2 / N))
        pa = Point(math.cos(math.pi * 2 / N * K), math.sin(math.pi * 2 / N * K))
        pb = Point(math.cos(math.pi * 2 / N * (1 - K)), math.sin(math.pi * 2 / N * (1 - K)))

        intersection = line_intersection(a, pa, b, pb)
        ai = a - intersection
        bi = b - intersection
        S = abs(ai.det(bi)) / 2
        convex = abs(a.det(b)) / 2 * N
        return convex - S * N

if __name__ == "__main__":
    N = int(input())
    K = int(input())
    solver = Task()
    result = solver.solve(N, K)
    print(result)

# Input handling is not included in the translation. You may want to implement that based on the input method you prefer.
```
This is the translated Java code into Python. Please note that the input handling part is not included in this translation. Let me know if you need further assistance!
