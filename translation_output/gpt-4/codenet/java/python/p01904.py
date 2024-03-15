Here is the equivalent Python code for the provided Java source code:

```python
import math
from functools import cmp_to_key

class Vector2:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    
    def dot(self, v):
        return self.x * v.x + self.y * v.y
    
    def cross(self, v):
        return self.x * v.y - self.y * v.x
    
    def add(self, v):
        return Vector2(self.x + v.x, self.y + v.y)
    
    def subtract(self, v):
        return Vector2(self.x - v.x, self.y - v.y)
    
    def multiply(self, k):
        return Vector2(k * self.x, k * self.y)
    
    def __str__(self):
        return f"{self.x} {self.y}"
    
    def __eq__(self, other):
        if isinstance(other, Vector2):
            return self.x == other.x and self.y == other.y
        return False
    
    @staticmethod
    def convex_hull(points):
        def lexicographical_comp(v1, v2):
            if v1.x != v2.x:
                return v1.x - v2.x
            return v1.y - v2.y
        
        n = len(points)
        k = 0
        q = [None] * (n * 2)
        points.sort(key=cmp_to_key(lexicographical_comp))
        for i in range(n):
            while k >= 2 and q[k - 2].subtract(q[k - 1]).cross(q[k - 1].subtract(points[i])) <= 0:
                k -= 1
            q[k] = points[i]
            k += 1
        t = k + 1
        for i in range(n - 2, -1, -1):
            while k >= t and q[k - 2].subtract(q[k - 1]).cross(q[k - 1].subtract(points[i])) <= 0:
                k -= 1
            q[k] = points[i]
            k += 1
        return q[:k - 1]

# Main program
if __name__ == "__main__":
    D = [1, 0, -1, 0]
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
    theta = [0] * m
    for i in range(m):
        v1 = v[i]
        v2 = v[(i + 1) % m]
        theta[i] = math.atan2(v2.y - v1.y, v2.x - v1.x)
    
    theta.sort()
    min_area = float('inf')
    
    def area(vertices, angle):
        amax = float('-inf')
        amin = float('inf')
        bmax = float('-inf')
        bmin = float('inf')
        cos = math.cos(angle)
        sin = math.sin(angle)
        for pt in vertices:
            a = pt.x * cos + pt.y * sin
            b = pt.x * -sin + pt.y * cos
            amax = max(amax, a)
            amin = min(amin, a)
            bmax = max(bmax, b)
            bmin = min(bmin, b)
        return (amax - amin) * (bmax - bmin)
    
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
```

Note that the input/output handling and some other details are simplified in the Python code. This may affect the runtime performance and memory usage of the Python version, but for the translation, we've focused on converting the core logic and class definitions. If the Java code is handling input from a file or has specialized IO routines for performance optimization, you may need to implement similar functionality for Python if that's necessary for your use case.
