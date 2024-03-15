import math
from functools import cmp_to_key

class Vector2:
    def __init__(self, x=0, y=0):
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
    
    def __eq__(self, other):
        if isinstance(other, Vector2):
            return self.x == other.x and self.y == other.y
        return False
    
    @staticmethod
    def convex_hull(points):
        def lexicographical_comp(v1, v2):
            if v