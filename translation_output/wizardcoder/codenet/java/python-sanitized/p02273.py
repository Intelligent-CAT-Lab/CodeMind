import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print("{:.2f} {:.2f}".format(self.x, self.y))

def koch(n, a, b):
    if n == 0:
        return

    s = Tuple((2*a.x + 1*b.x) / 3, (2*a.y + 1*b.y) / 3)
    t = Tuple((1*a.x + 2*b.x) / 3, (1*a.y + 2*b.y) / 3)
    u = Tuple((t.x - s.x) * math.cos(math.pi * 60 / 180) - (t.y - s.y) * math.sin(math.pi * 60 / 180) + s.x,
              (t.x - s.x) * math.sin(math.pi * 60 / 180) + (t.y - s.y) * math.cos(math.pi * 60 / 180) + s.y)

    koch(n-1, a, s)
    s.print()
    koch(n-1, s, u)
    u.print()
    koch(n-1, u, t)
    t.print()
    koch(n-1, t, b)

if __name__ == '__main__':
    n = int(input())
    a = Tuple(0,0)
    b = Tuple(100,0)

    a.print()
    koch(n, a, b)
    b.print()