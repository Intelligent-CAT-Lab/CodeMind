from typing import List, Tuple
import math

class Point:
    def __init__(self, x: int, y: int):
        self.x = x
        self.y = y

    def __lt__(self, other) -> bool:
        if self.x != other.x:
            return self.x < other.x
        return self.y < other.y

    def __eq__(self, other) -> bool:
        return self.x == other.x and self.y == other.y

    def __str__(self) -> str:
        return f"({self.x}, {self.y})"

    def __repr__(self) -> str:
        return self.__str__()

def gcd_rec(a: int, b: int) -> int:
    return b if a % b == 0 else gcd_rec(b, a % b)

def gcd(a: int, b: int) -> int:
    abs_a = abs(a)
    abs_b = abs(b)
    if abs_a == 0 or abs_b == 0:
        return abs_a + abs_b
    return gcd_rec(abs_a, abs_b)

def accept(x1: int, y1: int, x2: int, y2: int, x3: int, y3: int, k: int) -> bool:
    dx2 = x2 - x1
    dy2 = y2 - y1
    dx3 = x3 - x1
    dy3 = y3 - y1
    s_double = abs(dx2 * dy3 - dx3 * dy2)
    g1 = gcd(x1 - x2, y1 - y2)
    g2 = gcd(x2 - x3, y2 - y3)
    g3 = gcd(x3 - x1, y3 - y1)
    g = g1 + g2 + g3
    return s_double - g + 2 <= 2 * k

def solve(w: int, h: int, k: int) -> int:
    answer = 0
    for x1 in range(1, w):
        for y1 in range(1, h):
            for x2 in range(1, w):
                # (x1, 0), (0, y1), (x2, h)
                if accept(x1, 0, 0, y1, x2, h, k):
                    answer += 1
                # (x1, 0), (w, y1), (x2, h)
                if accept(x1, 0, w, y1, x2, h, k):
                    answer += 1
            for y2 in range(1, h):
                # (x1, 0), (0, y1), (w, y2)
                if accept(x1, 0, 0, y1, w, y2, k):
                    answer += 1
                # (x1, h), (0, y1), (w, y2)
                if accept(x1, h, 0, y1, w, y2, k):
                    answer += 1
    return answer

# Sample test case
w, h, k = map(int, input().split())
print(solve(w, h, k))