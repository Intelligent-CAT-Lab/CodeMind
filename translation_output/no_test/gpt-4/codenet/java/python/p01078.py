Here is the translated Python code from the provided Java code:

```python
import math
import sys

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def det(self, p):
        return self.x * p.y - self.y * p.x

    def sub(self, p):
        return Point(self.x - p.x, self.y - p.y)

    def add(self, p):
        return Point(self.x + p.x, self.y + p.y)

    def multiply(self, d):
        return Point(self.x * d, self.y * d)


def line_intersection(p1, p2, q1, q2):
    a = q2.sub(q1).det(q1.sub(p1))
    b = q2.sub(q1).det(p2.sub(p1))
    return p1.add(p2.sub(p1).multiply(a / b))


def solve():
    EPS = 2e-8

    N, K = map(int, input().split())
    a = Point(1.0, 0.0)
    b = Point(math.cos(math.pi * 2 / N), math.sin(math.pi * 2 / N))
    pa = Point(math.cos(math.pi * 2 / N * K), math.sin(math.pi * 2 / N * K))
    pb = Point(math.cos(math.pi * 2 / N * (1 - K)), math.sin(math.pi * 2 / N * (1 - K)))

    intersection = line_intersection(a, pa, b, pb)
    ai = a.sub(intersection)
    bi = b.sub(intersection)
    S = abs(ai.det(bi)) / 2
    convex = abs(a.det(b)) / 2 * N
    print(convex - S * N)

# Entry point in Python
if __name__ == "__main__":
    solve()
```

Please note that in Python you don't need to explicitly handle I/O (for FastScanner) since you can directly use functions like `input()` and `map()`. Here I used `input()` for reading input and `print()` for output. Furthermore, since Python supports complex numbers by default, it is possible to simplify this code even further by using the built-in complex type, but I provided a more direct translation using a custom `Point` class instead.
