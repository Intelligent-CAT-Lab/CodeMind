import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print(f"{self.x} {self.y}")

def koch(n, a, b):
    if n == 0:
        return

    s = Tuple((2.0 * a.x +