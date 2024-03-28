import re

class Result:
    def __init__(self, p, value):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024

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
        while p < len(cs) and cs[p].isdigit():
            r.value = r.value * 2 + int(cs[p])
            r.update()
            p += 1
        return r
    else:
        return Result(0, -1)

def F(p, cs):
    r = T(p, cs)
    if not r.good:
        return r
    while p < len(cs) and cs[p] == '*':
        r2 = T(p + 1, cs)
        if not r2.good:
            return r2
        r.value *= r2.value
        r.update()
        if not r.good:
            return r
        p = r2.p
    return r

def E(p, cs):
    r = F(p, cs)
    if not r.good:
        return r
    while p < len(cs) and (cs[p] == '+' or cs[p] == '-'):
        r2 = F(p + 1, cs)
        if not r2.good:
            return r2
        if cs[p] == '+':
            r.value += r2.value
        else:
            r.value -= r2.value
        r.update()
        if not r.good:
            return r
        p = r2.p
    return r

def calc(cs):
    r = E(0, cs)
    r.good &= r.p == len(cs) - 1
    if r.good:
        n = len(cs)
        for i in range(n):
            if cs[i] != '(':
                continue
            left = i
            right = left + 1
            stack = 0
            op = False
            while cs[right] != ')' or stack != 0:
                if cs[right] == '(':
                    stack += 1
                elif cs[right] == ')':
                    stack -= 1
                if stack == 0:
                    op |= cs[right] == '+' or cs[right] == '-' or cs[right] ==