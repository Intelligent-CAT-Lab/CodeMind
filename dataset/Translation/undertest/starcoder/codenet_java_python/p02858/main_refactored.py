class main:
    import sys
    
    class GCDs:
        @staticmethod
        def gcd(a, b):
            if a >= b:
                return GCDs.gcd0(a, b)
            else:
                return GCDs.gcd0(b, a)
    
        @staticmethod
        def gcd0(a, b):
            if b == 0:
                return a
            else:
                return GCDs.gcd0(b, a % b)
    
    
    class Modular:
        def __init__(self, m):
            self.m = m
    
        def valueOf(self, x):
            x %= self.m
            if x < 0:
                x += self.m
            return x
    
        def mul(self, x, y):
            return self.valueOf((long) x * y)
    
        def plus(self, x, y):
            return self.valueOf(x + y)
    
        def subtract(self, x, y):
            return self.valueOf(x - y)
    
        def getModularForPowerComputation(self):
            return Modular(self.m - 1)
    
        def __str__(self):
            return "mod " + str(self.m)
    
    
    class Power:
        def __init__(self, modular):
            self.modular = modular
    
        def pow(self, x, n):
            if n == 0:
                return self.modular.valueOf(1)
            r = self.pow(x, n >>