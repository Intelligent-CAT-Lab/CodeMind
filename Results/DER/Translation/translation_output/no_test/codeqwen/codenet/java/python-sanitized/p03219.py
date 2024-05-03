import sys

class Scanner:
    def __init__(self):
        self.buffer = sys.stdin.readline().strip()
        self.index = 0

    def next_int(self):
        while self.index < len(self.buffer) and not self.buffer[self.index].isdigit():
            self.index += 1
        if self.index == len(self.buffer):
            return None
        number = 0
        while self.index < len(self.buffer) and self.buffer[self.index].isdigit():
            number = number * 10 + int(self.buffer[self.index])
            self.index += 1
        return number

    def next_line(self):
        if self.index < len(self.buffer):
            line = self.buffer[self.index:]
            self.index = len(self.buffer)
            return line
        else:
            return None

class FixedPair:
    ZEROS = FixedPair(0, 0)

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return self.x + self.y

    def __str__(self):
        return f"({self.x}, {self.y})"

class Tuple:
    def __init__(self, t, v):
        self.t = t
        self.v = v

    def __eq__(self, other):
        return self.t == other.t and self.v == other.v

    def __hash__(self):
        return hash((self.t, self.v))

    def __str__(self):
        return f"<Tuple>=<{self.t}, {self.v}>"

class Util:
    @staticmethod
    def gcd(a, b):
        if a % b == 0:
            return b
        return Util.gcd(b, a % b)