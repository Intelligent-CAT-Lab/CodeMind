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
N = int("1")
a = Vector(0, 0)
b = Vector(100, 0)
a.print()
koch(N, a, b)
b.print()
