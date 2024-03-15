import sys
import io
import math
import bisect
import itertools

class p03219:
    @staticmethod
    def main():
        x = int(input())
        y = int(input())
        p03219.put(x + y // 2)

    @staticmethod
    def upper_bound(a, val):
        return bisect.bisect_right(a, val)

    @staticmethod
    def lower_bound(a, val):
        return bisect.bisect_left(a, val)

    @staticmethod
    def max(a, b):
        return max(a, b)

    @staticmethod
    def min(a, b):
        return min(a, b)

    @staticmethod
    def abs(a):
        return abs(a)

    @staticmethod
    def print(object):
        sys.stdout.write(str(object))

    @staticmethod
    def put(object=""):
        print(object)

    @staticmethod
    def format(string, *args):
        return string.format(*args)

class FixedPair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def getX(self):
        return self.x

    def getY(self):
        return self.y

    def __hash__(self):
        return self.x + self.y

    def __eq__(self, other):
        if not isinstance(other, FixedPair):
            return False
        return self.x == other.x and self.y == other.y

    def __str__(self):
        return f"({self.x},{self.y})"

class Tuple:
    def __init__(self, t, v):
        self.t = t
        self.v = v

    def getT(self):
        return self.t

    def getV(self):
        return self.v

    def __hash__(self):
        return hash(self.t) + hash(self.v)

    def __eq__(self, other):
        if not isinstance(other, Tuple):
            return False
        return self.t == other.t and self.v == other.v

    def __str__(self):
        return f"<Tuple>=<{self.t},{self.v}>"

class Util:
    @staticmethod
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    @staticmethod
    def lcm(a, b):
        return a * b // Util.gcd(a, b)

    @staticmethod
    def kaijoMod(n, mod):
        if n < 1:
            return -1
        result = 1
        for i in range(n, 1, -1):
            result *= i
            result %= mod
        return result

    @staticmethod
    def count(lst):
        sorted_lst = sorted(lst)
        return {value: len(list(freq)) for value, freq in itertools.groupby(sorted_lst)}

    @staticmethod
    def toStringBWS(iterable):
        return ' '.join(str(x) for x in iterable)

    @staticmethod
    def toStringBWS(array):
        return ' '.join(str(x) for x in array)

# Entry point
if __name__ == "__main__":
    p03219.main()