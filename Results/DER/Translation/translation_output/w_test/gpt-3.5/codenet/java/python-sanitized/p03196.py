from collections import defaultdict

class Solver:
    def __init__(self):
        self.sc = FastScanner()
    
    def ns(self):
        return self.sc.next()
    
    def ni(self):
        return int(self.sc.next())
    
    def nl(self):
        return int(self.sc.next())
    
    def solve(self):
        n = self.nl()
        p = self.nl()
        factor = self.factor(p)
        ans = 1
        for i in range(len(factor)):
            if factor[i][1] >= n:
                ans *= self.pow(factor[i][0], factor[i][1] // n)
        self.prtln(ans)

    def factor(self, a):
        factor_list = []
        for i in range(2, int(a**0.5) + 1):
            if a % i == 0:
                count = 0
                while a % i == 0:
                    a //= i
                    count += 1
                factor_list.append([i, count])
        if a > 1:
            factor_list.append([a, 1])
        return factor_list

    def pow(self, x, y):
        return x**y

    def prtln(self, *args):
        print(*args)

class FastScanner:
    def next(self):
        return input()

solver = Solver()
solver.solve()