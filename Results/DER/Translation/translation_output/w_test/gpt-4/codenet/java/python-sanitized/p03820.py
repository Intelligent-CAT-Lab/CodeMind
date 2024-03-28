MOD = 1_000_000_007

class ModCalculator:
    def __init__(self, mod):
        self.mod = mod
        self.factorial_cache = [1]
        self.factorial_inverse_cache = [1]
        
    def add(self, a, b):
        return (a + b) % self.mod
    
    def sub(self, a, b):
        return (a - b + self.mod) % self.mod
    
    def mul(self, a, b):
        return (a * b) % self.mod
    
    def pow(self, a, b):
        result = 1
        while b:
            if b & 1:
                result = self.mul(result, a)
            a = self.mul(a, a)
            b >>= 1
        return result
    
    def inverse(self, a):
        return self.pow(a, self.mod - 2)
    
    def div(self, a, b):
        return self.mul(a, self.inverse(b))

class Solver:
    def __init__(self, n, k):
        self.n = n
        self.k = k
        self.mc = ModCalculator(MOD)
    
    def calculate_order_2(self):
        n, k, mc = self.n, self.k, self.mc
        dptable = [[0] * n for _ in range(n)]
        dptable[n - 1][0] = 1
        for i in range(k - 1):
            dptable[n - 2 - i][0] = mc.add(dptable[n - i - 1][0], dptable[n - 2 - i][1])
            for j in range(1, n - 1 - i):
                dptable[n - 2 - i - j][j] = mc.add(dptable[n - i - j - 1][j - 1], dptable[n - 2 - i - j][j + 1])
        sum = 0
        for j in range(n - k + 1):
            sum = mc.add(sum, dptable[j][n - k - j])
        return sum
    
    def solve(self):
        v12 = self.calculate_order_2()
        v2 = self.mc.pow(2, self.n - self.k - 1)
        return self.mc.mul(v12, v2)

def execute(n, k):
    solver = Solver(n, k)
    return solver.solve()

# Usage
if __name__ == '__main__':
    n, k = map(int, input().split())
    print(execute(n, k))