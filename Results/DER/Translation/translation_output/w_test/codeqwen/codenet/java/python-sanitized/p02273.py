import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print_tuple(self):
        print(f"{self.x:.8f} {self.y:.8f}")

def koch(n, a, b):
    if n == 0:
        return
    s = Tuple((2.0 * a.x + 1.0 * b.x) / 3.0, (2.0 * a.y + 1.0 * b.y) / 3.0)
    t = Tuple((1.0 * a.x + 2.0 * b.x) / 3.0, (1.0 * a.y + 2.0 * b.y) / 3.0)
    u = Tuple((t.x - s.x) * math.cos(math.radians(60)) - (t.y - s.y) * math.sin(math.radians(60)) + s.x,
              (t.x - s.x) * math.sin(math.radians(60)) + (t.y - s.y) * math.cos(math.radians(60)) + s.y)

    koch(n - 1, a, s)
    s.print_tuple()
    koch(n - 1, s, u)
    u.print_tuple()
    koch(n - 1, u, t)
    t.print_tuple()
    koch(n - 1, t, b)

if __name__ == "__main__":
    n = int(input())
    a = Tuple(0.0, 0.0)
    b = Tuple(100.0, 0.0)

    a.print_tuple()
    koch(n, a, b)
    b.print_tuple()