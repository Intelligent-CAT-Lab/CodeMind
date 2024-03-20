import sys

def power(a, e, modP):
    ret = 1
    for i in range(e):
        ret = (ret * a) % modP
    return ret

m, n = map(int, sys.stdin.readline().split())
print(power(m, n, 1000000007))