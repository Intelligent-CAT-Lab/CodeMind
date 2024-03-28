import sys

class p01542:
    INF = 1 << 28
    EPS = 1e-12

    def __init__(self):
        self.s = sys.stdin.readline().strip()

    def run(self):
        self.solve()

    def solve(self):
        self.s += "$"
        self.cs = list(self.s)
        self.max = -1
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
                left, right = i, left + 1
                stack = 0
                op = False
                for right in range(left + 1, n):
                    if self.cs[right] == '(':
                        stack += 1
                    elif self.cs[right] == ')':
                        stack -= 1
                    if stack == 0:
                        op |= self.cs[right] == '+' or self.cs[right] == '-' or self.cs[right] == '*'
                r.good &= op
            return r.value if r.good else -1

    def E(self, p):
        r = self.F(p)
        if not r.good:
            return r
        while self.cs[r.p] == '+' or self.cs[r.p] == '-':
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
                return r2
            r.value *= r2.value
            r.update()
            if not r.good:
                return r
            r.