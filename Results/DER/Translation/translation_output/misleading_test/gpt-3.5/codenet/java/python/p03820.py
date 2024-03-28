```python
class Solver:
    def __init__(self, n, k):
        self.n = n
        self.k = k
        self.mc = ModCalculator(1000000007)
    
    def calculate_order1(self):
        dptable = [[0] * self.n for _ in range(self.n)]
        dptable[self.n - 1][0] = 1
        for i in range(self.k):
            for j in range(self.n - 1 - i):
                t = self.n - 1 - i - j
                for k in range(1, j+1):
                    dptable[j - k][t + k - 1] = self.mc.add(dptable[j - k][t + k - 1], dptable[j][t])
                if t > 0:
                    dptable[j][t - 1] = self.mc.add(dptable[j][t - 1], dptable[j][t])

        sum_val = 0
        for j in range(self.n - self.k + 1):
            sum_val = self.mc.add(sum_val, dptable[j][self.n - self.k - j])
        
        return sum_val
    
    def calculate_order2(self):
        dptable = [[0] * self.n for _ in range(self.n)]
        dptable[self.n - 1][0] = 1
        for i in range(self.k - 1):
            dptable[self.n - 2 - i][0] = self.mc.add(dptable[self.n - 1 - i][0], dptable[self.n - 2 - i][1])
            for j in range(1, self.n - 1 - i):
                dptable[self.n - 2 - i - j][j] = self.mc.add(dptable[self.n - 2 - i - j + 1][j - 1], dptable[self.n - 2 - i - j][j + 1])

        sum_val = 0
        for j in range(self.n - self.k + 1):
            sum_val = self.mc.add(sum_val, dptable[j][self.n - self.k - j])
        
        return sum_val

    def solve(self):
        v12 = self.calculate_order2()
        v2 = self.mc.pow(2, self.n - self.k - 1)
        
        return self.mc.mul(v12, v2)

class ModCalculator:
    def __init__(self, mod):
        self.mod = mod
        self.mod_combination_cache = ModCombinationCache()
    
    def add(self, a, b):
        return (a + b) % self.mod

    def mul(self, a, b):
        return (a * b) % self.mod

    def pow(self, a, b):
        if b == 0:
            return 1

        v = self.pow(self.mul(a, a), b // 2)
        if b % 2 == 1:
            return self.mul(v, a)
        else:
            return v

    def inverse(self, a):
        return self.pow(a, self.mod - 2)

    class ModCombinationCache:
        def __init__(self):
            self.factorial_cache = [1]
            self.factorial_inverse_cache = [1]

        def resize(self, n):
            for i in range(len(self.factorial_cache), n + 1):
                v = self.mul(self.factorial_cache[-1], i)
                self.factorial_cache.append(v)
                self.factorial_inverse_cache.append(self.inverse(v))

        def getF(self, n):
            self.resize(n)
            return self.factorial_cache[n]

        def getP(self, n, r):
            self.resize(n)
            return self.mul(self.factorial_cache[n], self.factorial_inverse_cache[n - r])

        def getC(self, n, k):
            self.resize(n)
            return self.mul(self.factorial_cache[n], self.mul(self.factorial_inverse_cache[k], self.factorial_inverse_cache[n - k]))

def execute(n, k):
    solver = Solver(n, k)
    return solver.solve()

# Test input
n, k = map(int, input().split())
result = execute(n, k)
print(result)
```

