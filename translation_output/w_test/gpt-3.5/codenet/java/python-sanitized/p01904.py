import math
import sys
from collections import deque
from typing import List, Tuple

class Vector2:
    def __init__(self, x: int, y: int):
        self.x = x
        self.y = y

    def dot(self, v):
        return self.x * v.x + self.y * v.y

    def cross(self, v):
        return self.x * v.y - self.y * v.x

    def add(self, v):
        return Vector2(self.x + v.x, self.y + v.y)

    def subtract(self, v):
        return Vector2(self.x - v.x, self.y - v.y)

    def multiply(self, k):
        return Vector2(k * self.x, k * self.y)

    def __str__(self):
        return f"{self.x} {self.y}"

    def __eq__(self, o):
        if isinstance(o, Vector2):
            return self.x == o.x and self.y == o.y
        return super().__eq__(o)

def convex_hull(p: List[Vector2]) -> List[Vector2]:
    n = len(p)
    k = 0
    p.sort(key=lambda v: (v.x, v.y))

    def lexicographical_comp(o1, o2):
        if o