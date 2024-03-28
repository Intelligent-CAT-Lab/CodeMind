```python
import math

class Task:
    def solve(self, N, K):
        a = Point(1.0, 0.0)
        b = Point(math.cos(math.pi * 2 / N), math.sin(math.pi * 2 / N))
        pa = Point(math.cos(math.pi * 2 / N * K), math.sin(math.pi * 2 / N * K))
        pb = Point(math.cos(math.pi * 2 / N * (1 - K)), math.sin(math.pi * 2 / N * (1 - K))

        intersection = self.lineIntersection(a, pa, b, pb)
        ai = a.sub(intersection)
        bi = b.sub(intersection)
        S = abs(ai.det(bi)) / 2
        convex = abs(a.det(b)) / 2 * N
        result = convex - S * N
        return result

    @staticmethod
    def lineIntersection(p1, p2, q1, q2):
        a = (q2.sub(q1)).det(q1.sub(p1))
        b = (q2.sub(q1)).det(p2.sub(p1))
        return p1.add((p2.sub(p1)).multiply(a / b))

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

if __name__ == "__main__":
    N, K = map(int, input().split())
    solver = Task()
    result = solver.solve(N, K)
    print(result)
```
```
