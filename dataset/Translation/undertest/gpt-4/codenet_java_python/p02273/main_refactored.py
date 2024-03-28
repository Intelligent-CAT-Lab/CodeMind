class main:
    import math
    
    class Tuple:
        def __init__(self, x, y):
            self.x = x
            self.y = y
    
        def print(self):
            print(f"{self.x:.8f} {self.y:.8f}")
    
    def koch(n, a, b):
        if n == 0:
            return
    
        cos60 = math.cos(math.pi * 60.0 / 180.0)
        sin60 = math.sin(math.pi * 60.0 / 180.0)
    
        s = Tuple((2.0 * a.x +