class main:
    import sys
    
    class Combinatrics:
        def __init__(self, n):
            self.n = n
            self.fact = [1] * (n + 1)
            self.inv = [1] * (n + 1)
            self.finv = [1] * (n + 1)
            self.fact[0] = self.fact[1] = 1
            self.finv[0] = self.finv[1] = 1
            self.inv[1] = 1
            for i in range(2, n + 1):
                self.fact[i] = self.fact[i - 1] * i % 100