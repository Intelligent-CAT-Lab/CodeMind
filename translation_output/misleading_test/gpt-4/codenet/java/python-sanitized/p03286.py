import math

class p03286:
    def __init__(self):
        self.dx = [0, 1, 0, -1]
        self.dy = [-1, 0, 1, 0]
        self.MOD = int(1e9+7)
    
    def run(self):
        N = self.nextLong()
        ans = "0" if N == 0 else ""
        while N != 0:
            q = self.q(N, -2)
            r = self.r(N, -2)
            ans = str(r) + ans
            N = q
        print(ans)
    
    def q(self, a, b):
        return self.floor(a, b) if b > 0 else self.ceil(a, b)
    
    def r(self, a, b):
        return a - self.q(a, b) * b
    
    def floor(self, a, b):
        if b < 0:
            a *= -1
            b *= -1
        return a // b if a > 0 else (a - b + 1) // b
    
    def ceil(self, a, b):
        if b < 0:
            a *= -1
            b *= -1
        return (a + b - 1) // b if a > 0 else a // b

    def nextLong(self):
        return int(input().strip())

# Sample test case
p03286_instance = p03286()
p03286_instance.run()