class main:
    import sys
    
    class p01542:
        def __init__(self):
            self.s = sys.stdin.readline().strip()
            self.INF = 1 << 28
            self.EPS = 1e-12
            self.cs = None
            self.max = -1
    
        def run(self):
            self.solve()
    
        def solve(self):
            self.s += "$"
            self.cs = list(self.s)
            self.dfs(0)
            print(self.max)
    
        def dfs(self, i):
            op = ['0', '1', '+', '-', '*', '(', ')']
            if i == len(self.cs):
                self.max = max(self.max, self.calc())
                return
            if self.cs[i] == '.':
                for c in op:
                    self.cs[i] = c
                    self.dfs(i + 1)
                    self.cs[i] = '.'
            else:
                self.dfs(i + 1)
    
        def calc(self):
            r = self.E(0)
            r.good &= r.p == len(self.cs) - 1
            if r.good:
                n = len(self.cs)
                for i in range(n):
                    if self.cs[i] != '(':
                        continue
                    left = i
                    right = left + 1
                    stack = 0
                    op = False
                    for _ in range(self.cs[right] != ')' or stack != 0):
                        if self.cs[right] == '(':
                            stack += 1
                        elif self.cs[right] == ')':
                            stack -= 1
                        if stack == 0:
                            op |= self.cs[right] in ['+', '-', '*']
                        right += 1
                    r.good &= op
            return r.good and r.value or -1
    
        def E(self, p):
            r = self.F(p)
            if not r.good:
                return r
            while self.cs[r.p] in ['+', '-']:
                r2 = self.F(r.p + 1)
                if not r2.good:
                    return r2
                if self.cs[r.p] == '+':
                    r.value += r2.value
                else:
                    r.value -= r2.value
                r.update()
                if not r.good:
                    return r
                r.p = r2.p
            return r
    
        def F(self, p):
            r = self.T(p)
            if not r.good:
                return r
            while self.cs[r.p] == '*':
                r2 = self.T(r.p + 1)
                if not r2.good:
                    return r