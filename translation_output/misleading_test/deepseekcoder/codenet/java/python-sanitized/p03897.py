import sys

class Vec2i:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        if isinstance(other, self.__class__):
            return self.x == other.x and self.y == other.y
        return False

    def __hash__(self):
        return hash((self.x, self.y))

    def __str__(self):
        return "({0}, {1})".format(self.x, self.y)

    def compareTo(self, o):
        if self.x == o.x:
            return (self.y > o.y) - (self.y < o.y)
        return (self.x > o.x) - (self.x < o.x)


class LightWriter:
    def __init__(self, out):
        self.out = out
        self.breaked = True

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        self.print(s)

    def ans(self, i):
        self.ans(str(i))

    def ln(self):
        self.print(sys.line_separator)
        self.breaked = True


class LightScanner:
    def __init