import math

def p03194():
    n, p = map(int, input().split())
    if n == 1:
        return p
    res = 1
    for i in range(2, int(math.pow(p, 1/n))+1):
        if p % math.pow(i, n) == 0:
            res = i
    return res

print(p03194())