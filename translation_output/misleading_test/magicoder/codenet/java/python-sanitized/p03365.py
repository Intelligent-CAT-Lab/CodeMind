import sys

def c(a, b):
    if a == 0 or a == b:
        return 1
    else:
        return (fact[b] * inv[a] * inv[b - a]) % _m

def fact(a):
    if a == 0 or a == 1:
        return 1
    else:
        return (a * fact(a - 1)) % _m

def solve(i):
    md = [0] * i
    rm = i - 2
    lx = i - 2
    while rm >= 0:
        md[lx + 1] = c(rm, lx)
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, i):
        cur = (fact(m) * fact(i - m - 1)) % _m
        cur = (cur * md[m]) % _m
        res = (res + (cur - prev + _m) * m) % _m
        prev = cur
    return res

_m = 1000000007
fact = [0] * 1000001
inv = [0] * 1000001
ifact = [0] * 1000001

for s in range(2):
    fact[s] = 1
    ifact[s] = 1
    inv[s] = 1
inv[0] = 0
for i in range(2, len(inv)):
    inv[i] = (_m - (_m // i) * inv[_m % i] % _m) % _m
for i in range(2, len(fact)):
    fact[i] = i * fact[i - 1] % _m
    ifact[i] = inv[i] * ifact[i - 1] % _m

i = int(sys.stdin.readline())
print(solve(i))