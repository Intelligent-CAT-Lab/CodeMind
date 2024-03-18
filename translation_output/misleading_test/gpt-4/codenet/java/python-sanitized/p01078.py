import math
import sys

# Using a smaller value for epsilon in Python to account for floating-point precision
EPS = 1e-10


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def det(self, p):
        return self.x * p.y - self.y * p.x

    def sub(self, p):
        return Point(self.x - p.x, self.y - p.y)

    def add(self, p):
        return Point(self.x + p.x, self.y + p.y)

    def multiply(self, d):
        return Point(self.x * d, self.y * d)


def line_intersection(p1, p2, q1, q2):
    a = (q2.sub(q1)).det(q