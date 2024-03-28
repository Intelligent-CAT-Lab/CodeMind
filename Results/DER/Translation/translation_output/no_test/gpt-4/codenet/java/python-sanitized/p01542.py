import sys
from typing import Tuple

EPS = 1e-12

class Result:
    def __init__(self, p: int, value: int):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024


def main():
    s = input()
    solve(s)


def solve(s: str):
    s += "$"
    cs = list(s)
    max_val = [-1]

    def dfs(i):
        op = ['0', '1', '+', '-', '*', '(', ')']
        if i == len(cs):
            max_val[0] = max(max_val[0], calc(cs))
            return
        if cs[i] == '.':
            for c in op:
                cs[i] = c
                dfs(i+1)
                cs[i] = '.'
        else:
            dfs(i+1)

    def calc(cs):
        r = E(cs, 0)
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
                        op |= cs[right] in ['+', '-', '*']
                    right += 1
                r.good &= op
        return r.value if r.good else -1

    def E(cs, p):
        r = F(cs, p)
        if not r.good:
            return r
        while cs[r.p] in ['+', '-']:
            r2 = F(cs, r.p + 1)
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

    def F(cs, p):
        r = T(cs, p)
        if not r.good:
            return r
        while cs[r.p] == '*':
            r2 = T(cs, r.p + 1)
            if not r2.good:
                return r2
            r.value *= r2.value
            r.update()
            if not r.good:
                return r
            r.p = r2.p
        return r

    def T(cs, p):
        if cs[p] == '(':
            r = E(cs, p + 1)
            if not r.good or cs[r.p] != ')':
                r.good = False
                return r
            r.p += 1
            return r
        elif cs[p] in ['0', '1']:
            r = Result(p, 0)
            while cs[r.p].isdigit():
                r.value = r.value * 2 + int(cs[r.p]) - int('0')
                r.update()
                r.p += 1
            return r
        else:
            return Result(0, -1)

    dfs(0)
    print(max_val[0])

if __name__ == '__main__':
    main()