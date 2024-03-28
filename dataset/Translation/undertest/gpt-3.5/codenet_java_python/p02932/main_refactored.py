class main:
    import sys
    import math
    
    class Modular:
        def __init__(self, m):
            self.m = m
    
        def value_of(self, x):
            x %= self.m
            if x < 0:
                x += self.m
            return x
    
        def mul(self, x, y):
            return self.value_of(x * y)
    
        def plus(self, x, y):
            return self.value_of(x + y)
    
        def subtract(self, x, y):
            return self.value_of(x - y)
    
    
    class Composite:
        def __init__(self, limit, modular):
            self.factorial = Factorial(limit, modular)
            self.modular = modular
    
        def composite(self, m, n):
            if n > m:
                return 0
            return self.modular.mul(self.modular.mul(self.factorial.fact[m], self.factorial.inv[n]),
                                    self.factorial.inv[m - n])
    
    
    class Number