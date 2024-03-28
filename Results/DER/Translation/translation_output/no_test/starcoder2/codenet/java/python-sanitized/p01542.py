import sys

def calc(s):
    def E(p):
        r = F(p)
        if not r[0]:
            return r
        while p < len(s) and (s[p] == '+' or s[p] == '-'):
            r2 = F(p + 1)
            if not r2[0]:
                return r2
            if s[p] == '+':
                r[1] += r2[1]
            else:
                r[1] -= r2[1]
            p = r2[2]
        return r

    def F(p):
        r = T(p)
        if not r[0]:
            return r
        while p < len(s) and s[p] == '*':
            r2 = T(p + 1)
            if not r2[0]:
                return r2
            r[1] *= r2[1]
            p = r2[2]
        return r

    def T(p):
        if s[p] == '(':
            r = E(p + 1)
            if not r[0] or s[r[2]] != ')':
                return [False, 0, 0]
            return [True, r[1], r[2] + 1]
        elif s[p] == '0' or s[p] == '1':
            r = [True, 0, p]
            for i in range(p, len(s)):
                if not s[i].isdigit():
                    break
                r[1] = r[1] * 2 + int(s[i])
                r[2] = i + 1
            return r
        else:
            return [False, 0, 0]

    return E(0)[1]

def dfs(i):
    op = ['0', '1', '+', '-', '*', '(', ')']
    if i == len(s):
        return calc(s)
    if s[i] == '.':
        for c in op:
            s[i] = c
            dfs(i + 1)
            s[i] = '.'
    else:
        dfs(i + 1)

s = list(input())
s.append('$')
print(dfs(0))