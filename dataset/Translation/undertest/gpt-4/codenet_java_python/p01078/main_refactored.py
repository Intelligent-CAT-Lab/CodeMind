class main:
    import math
    import sys
    
    EPS = 2e-8
    
    class Point:
        def __init__(self, x, y):
            self.x, self.y = x, y
        
        def __sub__(self, other):
            return Point(self.x - other.x, self.y - other.y)
        
        def __add__(self, other):
            return Point(self.x + other.x, self.y + other.y)
        
        def multiply(self, scalar):
            return Point(self.x * scalar, self.y * scalar)
        
        def det(self, other):
            return self.x * other.y - self.y * other.x
    
    
    def line_intersection(p1, p2, q1, q2):
        a = (q2 - q1).det(q1 - p1)
        b = (q2 - q1).det(p2 - p1)
        return p1 + (p2 - p1).multiply(a / b)
    
    def solve(N, K):
        a = Point(