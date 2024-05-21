import sys

def solve():
    s = input()
    n = len(s)
    a = [0] * (n + 2)
    b = [0] * (n + 2)
    c = [0] * (n + 2)
    d = [0] * (n + 2)
    a[0] = 1
    b[0] = 1
    for i in range(n):
        if s[i] == '0':
            a[i + 1] = a[i]
            b[i + 1] = b[i]
            c[i + 1] = c[i]
            d[i + 1] = d[i]
        elif s[i] == '1':
            a[i + 1] = a[i]
            b[i + 1] = b[i]
            c[i + 1] = c[i] + a[i]
            d[i + 1] = d[i] + b[i]
        else:
            a[i + 1] = a[i] + b[i]
            b[i + 1] = b[i] + c[i]
            c[i + 1] = c[i] + d[i]
            d[i + 1] = d[i] + a[i]
    print(min(a[-1], b[-1], c[-1], d[-1]))

input = lambda: sys.stdin.readline().rstrip()
solve()