import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"{self.x} {self.y}"

def koch(n, a, b):
    if n == 0:
        return

    s, t, u = (2 * a + b) / 3, (a + 2 * b) / 3, (t[0] - s[0]) * math.cos(math.pi / 3) - (t[1] - s[1]) * math.sin(math.pi / 3) + s[0], (t[0] - s[0]) * math.sin(math.pi / 3) + (t[1] - s[1]) * math.cos(math.pi / 3) + s[1]

    koch(n - 1, a, s)
    s.print()
    koch(n - 1, s, u)
    u.print()
    koch(n - 1, u, t)
    t.print()
    koch(n - 1, t, b)

n = int(input())
a = Tuple(0, 0)
b = Tuple(100, 0)

a.print()
koch(n, a, b)
b.print()