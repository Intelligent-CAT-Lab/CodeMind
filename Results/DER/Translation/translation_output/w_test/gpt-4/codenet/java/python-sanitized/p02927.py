import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.iterator = iter(stream.read().split())
    
    def next_int(self):
        return int(next(self.iterator))
    
    def next_long(self):
        return int(next(self.iterator))
    
    def next_double(self):
        return float(next(self.iterator))
    
    def next_char(self):
        return next(self.iterator)
    
    def next_str(self):
        return next(self.iterator)

class p02927:
    def __init__(self):
        self.MOD = (int)(1e9+7)
        self.inp = FastScanner()
    
    def solve(self):
        M = self.inp.next_int()
        D = self.inp.next_int()
        ans = 0
        for m in range(1, M + 1):
            for d in range(1, D + 1):
                d1 = d % 10
                d2 = d // 10
                if d1 >= 2 and d2 >= 2 and d1 * d2 == m: 
                    ans += 1
        print(ans)

if __name__ == '__main__':
    solver = p02927()
    solver.solve()