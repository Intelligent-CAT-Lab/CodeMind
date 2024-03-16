import sys

def f(i):
    if i > n:
        return 0
    if f[i] == -1:
        f[i] = f(i + 1)
        if i + 3 <= n:
            since = i + 3
            until = n - i - 1
            f[i] = (f[i] + f[since]) + n - until
            f[i] = (f[i] + f[i + 1]) + mod.mul(n - 1, n - 1)
        else:
            f[i] = (f[i] + f[i + 1]) + mod.mul(n - 1, n)
    return f[i]

def suffix(i):
    if i > n:
        return 0
    if suffix[i] == -1:
        suffix[i] = f(i) + suffix(i + 1)
    return suffix[i]

n = int(input().strip())
f = [-1] * (n + 1)
suffix = [-1]