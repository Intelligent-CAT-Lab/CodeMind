import math

def p03194():
    n = int(input())
    p = int(input())
    if n == 1:
        print(p)
        return
    res = 1
    i = 2
    while math.pow(i, n) <= p:
        if p % math.pow(i, n) == 0:
            res = i
        i += 1
    print(res)

p03194()