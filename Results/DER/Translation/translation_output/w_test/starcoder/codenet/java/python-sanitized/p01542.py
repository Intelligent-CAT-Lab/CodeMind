import sys

class Solution:
    def __init__(self):
        self.s = ""
        self.cs = []
        self.max = -1

    def solve(self):
        self.s += "$"
        self.cs = list(self.s)
        self.max = -1
        self.dfs(0)
        print(self.max)

    def dfs(self, i):
        if i == len(self.cs):
            self.max = max(self.max, self.calc())
            return
        if self.cs[i] == '.':
            for c in ['0', '1', '+', '-', '*', '(', ')']:
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
                if self.cs[i]!= '(':
                    continue
                left = i
                right = left + 1
                stack = 0
                op = False
                for j in range(right, n):
                    if self.cs[j] == '(':
                        stack += 1
                    elif self.cs[j] == ')':
                        stack -= 1
                    if stack == 0:
                        op |= self.cs[j] == '+' or self.cs[j] == '-' or self.cs[j] == '*'
                r.good &= op
        return r.good and r.value or -1

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
            r.p = r2.p
        return r

    def T(self, p):
        if self.cs[p] == '(':
            r = self.E(p + 1)
            if not r.good or self.cs[r.p]!= ')':
                r.good = False
                return r
            r.p += 1
            return r
        elif self.cs[p] == '0' or self.cs[p] == '1':
            r = Result(p, 0)
            for j in range(r.p, len(self.cs)):
                if not self.cs[j].isdigit():
                    break
                r.value = r.value * 2 + int(self.cs[j])
                r.update()
            return r
        else:
            return Result(0, -1)

    class Result:
        def __init__(self, p, value):
            self.p = p
            self.value = value
            self.good = True

        def update(self):
            self.good &= 0 <= self.value and self.value < 1024


def main():
    s = Solution()
    s.s = sys.