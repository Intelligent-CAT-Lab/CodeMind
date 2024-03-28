from collections import namedtuple

class Tuple(namedtuple('Tuple', 'x, y')):
    def __new__(_cls, x=0.0, y=0.0):
        return super().__new__(_cls, x, y)

def koch(n, a, b):
    if n == 0:
        return

    s, t, u = (Tuple(2.0 * a.x +