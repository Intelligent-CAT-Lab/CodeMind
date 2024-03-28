import re

class Result:
    def __init__(self, p, value):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024

def E(p, cs):
    r = F(p, cs)
    if not r.good:
        return r
    while cs[r.p] == '+' or cs[r.p] == '-':
        r2 = F(r.p + 1, cs)
        if not r2.good:
            return r2
        if cs[r.p] == '+':
            r.value += r2.value
        else:
            r.value -= r2.value
        r.update()
        if not r.good:
            return r
        r.p = r2.p
    return r

def F(p, cs):
    r = T(p, cs)
    if not r.good:
        return r
    while cs[r.p] == '*':
        r2 = T(r.p + 1, cs)
        if not r2.good:
            return r2
        r.value *= r2.value
        r.update()
        if not r.good:
            return r
        r.p = r2.p
    return r

def T(p, cs):
    if cs[p] == '(':
        r = E(p + 1, cs)
        if not r.good or cs[r.p] != ')':
            r.good = False
            return r
        r.p += 1
        return r
    elif cs[p] == '0' or cs[p] == '1':
        r = Result(p, 0)
        while p < len(cs) and cs[r.p].isdigit():
            r.value = r.value * 2 + int(cs[r.p])
            r.update()
            r.p += 1
        return r
    else:
        return Result(0, -1)

def solve(s):
    s += "$"
    cs = list(s)
    max_val = -1
    dfs(0, cs, max_val)
    print(max_val)

def dfs(i, cs, max_val):
    op = ['0', '1', '+', '-', '*', '(', ')']
    if i == len(cs):
        max_val = max(max_val, calc(cs))
        return max_val
    if cs[i] == '.':
        for c in op:
            cs[i] = c
            max_val = dfs(i + 1, cs,