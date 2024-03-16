import math
import sys

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
        return f'{self.x} {self.y}'

    def __eq__(self, other):
        if isinstance(other, Vector2):
            return self.x == other.x and self.y == other.y
        return False

    @staticmethod
    def convex_hull(p):
        n = len(p)
        k = 0
        p.sort(key=lambda v: (v.x, v.y))

        def take_second(elem):
            return elem[1]
        
        q = [0] * (n * 2)
        for i in range(n):
            while k >= 2 and (q[k-2].subtract(q[k-1]).cross(q[k-1].subtract(p[i])) <= 0):
                k -= 1
            q[k] = p[i]
            k += 1
        
        t = k + 1
        for i in range(n - 2, -1, -1):
            while k >= t and (q[k-2].subtract(q[k-1]).cross(q[k-1].subtract(p[i])) <= 0):
                k -= 1
            q[k] = p[i]
            k += 1
        
        return q[:k-1]

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

if __name__ == "__main__":
    n = int(input())
    D = [1, 0, -1, 0]
    sqi = [0] * n
    sqj = [0] * n
    
    for i in range(1, n):
        x, d = map(int, input().split())
        sqi[i] = sqi[x] + D[d]
        sqj[i] = sqj[x] + D[d ^ 1]

    pp = [0] * (n * 4)
    for i in range(n):
        pp[i*4] = Vector2(sqi[i], sqj[i])
        pp[i*4+1] = Vector2(sqi[i], sqj[i] + 1)
        pp[i*4+2] = Vector2(sqi[i] + 1, sqj[i])
        pp[i*4+3] = Vector2(sqi[i] + 1, sqj[i] + 1)

    v = Vector2.convex_hull(pp)
    
    m = len(v)
    theta = [0] * m
    for i in range(m):
        v1 = v[i]
        v2 = v[(i + 1) % m]
        theta[i] = math.atan2(v2.y - v