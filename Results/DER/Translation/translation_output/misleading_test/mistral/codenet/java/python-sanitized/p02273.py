from collections import namedtuple
import math

class Tuple(namedtuple('Tuple', 'x, y')):
    def __str__(self):
        return '({:.2f}, {:.2f})'.format(self.x, self.y)

def koch(n, a, b):
    if n == 0:
        return

    s, t, u = (Tuple(2 * a.x + b.x / 3, 2 * a.y + b.y / 3),
               Tuple(a.x + 2 * b.x / 3, a.y + 2 * b.y / 3),
               Tuple((t.x - s.x) * math.cos(math.pi / 3) - (t.y - s.y) * math.sin(math.pi / 3) + s.x,
                     (t.x - s.x) * math.sin(math.pi / 3) + (t.y - s.y) * math.cos(math.pi / 3) + s.y))

    koch(n - 1, a, s)
    s.print()
    koch(n - 1, s, u)
    u.print()
    koch(n - 1, u, t)
    t.print()
    koch(n - 1, t, b)

if __name__ == '__main__':
    n = int(input())
    a = Tuple(0, 0)
    b = Tuple(100, 0)

    a.print()
    koch(n, a, b)
    b.print()