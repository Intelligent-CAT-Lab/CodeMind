class main:
    import sys
    
    class Solver:
        def __init__(self, n, k):
            self.n = n
            self.k = k
            self.mc = ModCalculator(1000000007)
        
        def calculate_order1(self):
            dptable = [[0 for _ in range(self.n)] for _ in range(self.n)]
            dptable[self.n - 1][0] = 1
            for i in range(self.k):
                for j in range(self.n - 1 - i):
                    t = self.n - 1 - i - j
                    for kk in range(1, j+1):
                        dptable[j - kk][t + kk - 1] = self.mc.add(dptable[j - kk][t + kk - 1], dptable[j][t])
                    if t > 0:
                        dptable[j][t - 1] = self.mc.add(dptable[j][t - 1], dptable[j][t])
    
            total_sum = 0
            for j in range(self.n - self.k + 1):
                total_sum = self.mc.add(total_sum, dptable[j][self.n - self.k - j])
            return total_sum
    
        def calculate_order2(self):
            dptable = [[0 for _ in range(self.n)] for _ in range(self.n)]
            dptable[self.n - 1][0] = 1
            for i in range(self.k-1):
                dptable[self.n - 2 - i][0] = self.mc.add(dptable[self.n - 1 - i][0], dptable[self.n-2-i][1])
                for j in range(1, self.n - 1 - i):
                    dptable[self.n - 2 - i - j][j] = self.mc.add(dptable[self.n - 1 - i - j + 1][j - 1], dptable[self.n - 1 - i - 1 - j][j + 1])
            
            total_sum = 0
            for j in range(self.n - self.k + 1):
                total_sum = self.mc.add(total_sum, dptable[j][self.n - self.k - j])
            return total_sum
    
        def solve(self):
            v12 = self.calculate_order2()
            v2 = self.mc.pow(2, self.n - self.k - 1)
            return self.mc.mul(v12, v2)
    
    class ModCalculator:
        def __init__(self, mod):
            self.mod = mod
            self.mod_comb_cache = self.ModCombinationCache()
    
        def add(self, a, b):
            return (a + b) % self.mod
    
        def mul(self, a, b):
            return (a * b) % self.mod
        
        def pow(self, a, b):
            if b == 0:
                return 1
            v = self.pow(self.mul(a, a), b // 2)
            return self.mul(v, a) if b % 2 else v
    
    class ContestReader:
        def __init__(self):
            self.tokens = []
    
        def next_int(self):
            if not self.tokens:
                self.tokens = input().split()
            return int(self.tokens.pop(0))
    
    if __name__ == '__main__':
        reader = ContestReader()
        n, k = reader.next_int(), reader.next_int()
        solver = Solver(n, k)
        result = solver.solve()
        print(result)