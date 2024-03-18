from collections import namedtuple
from math import gcd
from itertools import product

Point = namedtuple('Point', ['x', 'y'])

class NaiveSolver:
    def __init__(self, w, h, k):
        self.w = w
        self.h = h
        self.k = k

    @staticmethod
    def gcd_rec(a, b):
        return b if a % b == 0 else NaiveSolver.gcd_rec(b, a % b)

    @staticmethod
    def gcd(a, b):
        abs_a = abs(a)
        abs_b = abs(b)
        if abs_a == 0 or abs_b == 0:
            return abs_a + abs_b
        return NaiveSolver.gcd_rec(abs_a, abs_b)

    def accept(self, x1, y1, x2, y2, x3, y3):
        dx2 = x2 - x1
        dy2 = y2 - y1
        dx3 = x3 - x1
        dy3 = y3 - y1
        s_double = abs(dx2 * dy3 - dx3 * dy2)
        g1 = NaiveSolver.gcd(x1 - x2, y1 - y2)
        g2 = NaiveSolver.gcd(x2 - x3, y2 - y3)
        g3 = NaiveSolver.gcd(x3 - x1, y3 - y1)
        g = g1 + g2 + g3
        return s_double - g + 2 <= 2 * self.k

    def solve(self):
        answer = 0
        for x1, y1, x2, y2, x3, y3 in product(range(1, self.w), range(1, self.h), range(1, self.w), range(1, self.h), range(1, self.w), range(1, self.h)):
            if self.accept(x1, y1, x2, y2, x3, y3):
                answer += 1
        return answer

if __name__ == "__main__":
    w, h, k = map(int, input().split())
    solver = NaiveSolver(w, h, k)
    print(-solver.solve())