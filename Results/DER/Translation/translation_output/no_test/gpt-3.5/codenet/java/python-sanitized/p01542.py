import sys

class p01542:
    def __init__(self):
        self.cs = None
        self.max = None
        self.s = None
        self.INF = 2**28
        self.EPS = 1e-12

    def run(self):
        self.s = input()
        self.solve()

    def solve(self):
        self.s += "$"
        self.cs = list(self.s)
        self.max = -1
        self.dfs(0)
        print(str(self.max))

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
        r['good'] &= r['p'] == len(self.cs) - 1
        if r['good']:
            n = len(self.cs)
            for i in range(n):
                if self.cs[i] != '(':
                    continue
                left = i
                right = left + 1
                stack = 0
                op = False
                while self.cs[right] != ')' or stack != 0:
                    if self.cs[right] == '(':
                        stack += 1
                    elif self.cs[right] == ')':
                        stack -= 1
                    if stack == 0:
                        op |= self.cs[right] == '+' or self.cs[right] == '-' or self.cs[right] == '*'
                    right += 1
                r['good'] &= op
        return r['value'] if r['good'] else -1

    def E(self, p):
        r = self.F(p)
        if not r['good']:
            return r
        while self.cs[r['p']] in ['+', '-']:
            r2 = self.F(r['p'] + 1)
            if not r2['good']:
                return r2
            if self.cs[r['p']] == '+':
                r['value'] += r2['value']
            else:
                r['value'] -= r2['value']
            r['value'] = round(r['value'])  # If you want integer results
            r['p'] = r2['p']
        return r

    def F(self, p):
        r = self.T(p)
        if not r['good']:
            return r
        while self.cs[r['p']] == '*':
            r2 = self.T(r['p'] + 1)
            if not r2['good']:
                return r2
            r['value'] *= r2['value']
            r['value'] = round(r['value'])  # If you want integer results
            r['p'] = r2['p']
        return r

    def T(self, p):
        if self.cs[p] == '(':
            r = self.E(p + 1)
            if not r['good'] or self.cs[r['p']] != ')':
                r['good'] = False
                return r
            r['p'] += 1
            return r
        elif self.cs[p] in ['0', '1']:
            r = {'p': p, 'value': 0, 'good': True}
            while p < len(self.cs) and self.cs[p].isdigit():
                r['value'] = r['value'] * 2 + int(self.cs[p])
                p += 1
            r['p'] = p
            r['value'] = round(r['value'])  # If you want integer results
            return r
        else:
            return {'p': 0, 'value': -1, 'good': False}
    
    def print(self, s):
        print(s)

p = p01542()
p.run()