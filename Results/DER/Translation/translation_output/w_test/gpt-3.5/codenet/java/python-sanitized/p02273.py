import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def print_tuple(self):
        print("{:.8f} {:.8f}".format(self.x, self.y))

def koch(n, a, b):
    if n == 0:
        return
    
    s = Tuple((2.0 * a.x +