import math
from functools import cmp_to_key
from itertools import combinations

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, point):
        if self.x != point.x:
            return self.x < point.x
        return self.y < point.y

    def __str__(self):
        return f"({self.x}, {self.y})"

    def __repr__(self):
        return str(self)

def gcd_rec(a, b):
    return b if a % b == 0 else gcd_rec(b, a % b)

def gcd(a, b):
    abs_a = abs(a)
    abs_b = abs(b)
    if abs_a == 0 or abs_b == 0:
        return abs_a + abs_b
    return gcd_rec(abs_a, abs_b)

class NaiveSolver:
    def __init__(self, w, h, k):
        self.w = w
        self.h = h
        self.k = k

    def accept(self, x1, y1, x2, y2, x3, y3):
        dx2 = x2 - x1
        dy2 = y2 - y1
        dx3 = x3 - x1
        dy3 = y3 - y1
        s_double = abs(dx2 * dy3 - dx3 * dy2)
        g1 = gcd(x1 - x2, y1 - y2)
        g2 = gcd(x2 - x3, y2 - y3)
        g3 = gcd(x3 - x1, y3 - y1)
        g = g1 + g2 + g3
        return s_double - g + 2 <= 2 * self.k

    def solve(self):
        answer = 0
        for x1 in range(1, self.w):
            for y1 in range(1, self.h):
                for x2 in range(1, self.w):
                    if self.accept(x1, 0, 0, y1, x2, self.h):
                        answer += 1
                    if self.accept(x1, 0, self.w, y1, x2, self.h):
                        answer += 1
                for y2 in range(1, self.h):
                    if self.accept(x1, 0, 0, y1, self.w, y2):
                        answer += 1
                    if self.accept(x1, self.h, 0, y1, self.w, y2):
                        answer += 1
        return answer

    def add_answer(self, answers, x1, y1, x2, y2, x3, y3):
        points = [Point(x1, y1), Point(x2, y2), Point(x3, y3)]
        sorted_points = sorted(points)
        answers.append(sorted_points)

    def solve_list(self):
        answers = []
        for x1 in range(1, self.w):
            for y1 in range(1, self.h):
                for x2 in range(1, self.w):
                    if self.accept(x1, 0, 0, y1, x2, self.h):
                        self.add_answer(answers, x1, 0, 0, y1, x2, self.h)
                    if self.accept(x1, 0, self.w, y1, x2, self.h):
                        self.add_answer(answers, x1, 0, self.w, y1, x2, self.h)
                for y2 in range(1, self.h):
                    if self.accept(x1, 0, 0, y1, self.w, y2):
                        self.add_answer(answers, x1, 0, 0, y1, self.w, y2)
                    if self.accept(x1, self.h, 0, y1, self.w, y2):
                        self.add_answer(answers, x1, self.h, 0, y1, self.w, y2)

        answers.sort(key=cmp_to_key(lambda l1, l2: (l1 > l2) - (l1 < l2)))
        return answers

# ...