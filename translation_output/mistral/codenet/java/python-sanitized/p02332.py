import java.io.IOException
import java.util.Scanner

class Combinatrics:
    def __init__(self, n):
        self.fact = [1] * (n+1)
        self.inv = [1] * (n+1)
        self.finv = [1] * (n+1)
        self.fact[0], self.fact[1] = 1, 1
        self.inv[1] = 1
        for i in range(2, n+1):
            self.fact[i] = self.fact[i