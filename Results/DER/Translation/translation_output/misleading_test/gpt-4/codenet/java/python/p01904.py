Here's the translated Java code to Python:

```python
import math
import sys
from functools import cmp_to_key

D = [1, 0, -1, 0]

def main():
    n = int(input())
    sqi = [0] * n
    sqj = [0] * n
    for i in range(1, n):
        x, d = map(int, input().split())
        sqi[i] = sqi[x] + D[d]
        sqj[i] = sqj[x] + D[d ^ 1]

    pp = [None] * (n * 4)
    for i in range(n):
        pp[i * 4 + 0] = Vector2(sqi[i], sqj[i])
        pp[i * 4 + 1] = Vector2(sqi[i], sqj[i] + 1)
        pp[i * 4 + 2] = Vector2(sqi[i] + 1, sqj[i])
        pp[i * 4 + 3] = Vector2(sqi[i] + 1, sqj[i] + 1)

    v = Vector2.convex_hull(pp)
    m = len(v)
    theta = [0.0] * m
    for i in range(m):
        v1 = v[i]
        v2 = v[(i + 1) % m]
        theta[i] = math.atan2(v2.y - v1.y, v2.x - v1.x)
    
    theta.sort()
    min_area = float('inf')
    for i in range(m):
        l = theta[i]
        r = theta[i + 1] if i < m - 1 else (theta[0] + math.pi * 2)
        for j in range(90):
            x1 = (l * 2 + r) / 3
            x2 = (l + r * 2) / 3
            if area(v, x1) < area(v, x2):
                r = x2
            else:
                l = x1
        min_area = min(min_area, area(v, (r + l) / 2))
    
    print(f"{min_area:.6f}")

def area(v, theta):
    amax = float('-inf')
    amin = float('inf')
    bmax = float('-inf')
    bmin = float('inf')
    for i in range(len(v)):
        cos = math.cos(theta)
        sin = math.sin(theta)
        a = v[i].x * cos + v[i].y * sin
        b = v[i].x * -sin + v[i].y * cos
        amax = max(amax, a)
        amin = min(amin, a)
        bmax = max(bmax, b)
        bmin = min(bmin, b)
    
    return (amax - amin) * (bmax - bmin)

class Vector2:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        if isinstance(other, Vector2):
            return self.x == other.x and self.y == other.y
        return False

    @staticmethod
    def convex_hull(p):
        n = len(p)
        k = 0
        p.sort(key=cmp_to_key(lambda o1, o2: (o1.x - o2.x) if o1.x != o2.x else (o1.y - o2.y)))
        q = [None] * (n * 2)
        for i in range(n):
            while k >= 2 and (q[k - 2].subtract(q[k - 1]).cross(q[k - 1].subtract(p[i])) <= 0):
                k -= 1
            q[k] = p[i]
            k += 1
        for i in range(n - 2, -1, -1):
            while k >= len(q) // 2 + 1 and (q[k - 2].subtract(q[k - 1]).cross(q[k - 1].subtract(p[i])) <= 0):
                k -= 1
            q[k] = p[i]
            k += 1
        return q[:k-1]

    def subtract(self, v):
        return Vector2(self.x - v.x, self.y - v.y)

    def cross(self, v):
        return self.x * v.y - self.y * v.x

if __name__ == '__main__':
    main()
```

Please note that Python doesn't have an exact equivalent to Java's `IO` class, so instead, I've replaced those parts with Python's built-in input functionality. To fully mimic Java's `IO` class robustness and versatility, you may need to create a custom class in Python.

I've also assumed the existence of an input source, which is typically stdin in Python. The `print` function with an f-string is used to format the output similar to `System.out.println` with `String.format` in Java.

Run the above Python code with the test input you provided to get the expected output.
