import sys

def power(a, e, modP):
    ret = 1
    for i in range(e):
        ret = (ret * a) % modP
    return ret

m = int(sys.stdin.readline())
n = int(sys.stdin.readline())
print(power(m, n, 1000000007))