```python
import math

class Vector2:
    def __init__(self, x, y):
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

def convex_hull(p):
    n = len(p)
    k = 0
    p.sort(key=lambda x: (x.x, x.y))
    q = [Vector2(0, 0) for _ in range(n * 2)]
    i = 0
    while i < n:
        while k >= 2 and (q[k - 2].subtract(q[k - 1])).cross(q[k - 1].subtract(p[i])) <= 0:
            k -= 1
        q[k] = p[i]
        k += 1
        i += 1

    t = k + 1
    i = n - 2
    while i >= 0:
        while k >= t and (q[k - 2].subtract(q[k - 1])).cross(q[k - 1].subtract(p[i])) <= 0:
            k -= 1
        q[k] = p[i]
        k += 1
        i -= 1

    return q[:k - 1]
    

if __name__ == "__main__":
    n = int(input())
    D = [1, 0, -1, 0]
    sqi = [0] * n
    sqj = [0] * n

    for i in range(1, n):
        x, d = map(int, input().split())
        sqi[i] = sqi[x] + D[d]
        sqj[i] = sqj[x] + D[d ^ 1]

    pp = [Vector2(0, 0) for _ in range(n * 4)]
    for i in range(n):
        pp[i*4+0] = Vector2(sqi[i], sqj[i])
        pp[i*4+1] = Vector2(sqi[i], sqj[i]+1)
        pp[i*4+2] = Vector2(sqi[i]+1, sqj[i])
        pp[i*4+3] = Vector2(sqi[i]+1, sqj[i]+1)

    v = convex_hull(pp)
    m = len(v)
    theta = [0.0] * m

    for i in range(m):
        v1 = v[i]
        v2 = v[(i+1) % m]
        theta[i] = math.atan2(v2.y - v1.y, v2.x - v1.x)

    theta.sort()
    min_area = float('inf')
    for i in range(m):
        l = theta[i]
        r = theta[i+1] if i < m - 1 else (theta[0] + math.pi * 2)
        for j in range(90):
            x1 = (l * 2 + r) / 3
            x2 = (l + r * 2) / 3
            if area(v, x1) < area(v, x2):
                r = x2
            else:
                l = x1
        min_area = min(min_area, area(v, (r + l) / 2))

    print("{:.6f}".format(min_area))
```
