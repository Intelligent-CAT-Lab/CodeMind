import sys
import math

def main():
    n, m, a, b, p, q = map(int, sys.stdin.readline().split())
    INF = 10000000000000000
    if a == 1 and b == 1:
        ans = min(abs(m - (p + q) * i) for i in range(n + 1))
        print(ans)
        return
    lim = min(40, int(math.log(m / max(p, q), max(a, b)) + 1))
    powA = [1] * (lim + 1)
    powB = [1] * (lim + 1)
    for i in range(1, lim + 1):
        powA[i] = powA[i - 1] * a
        powB[i] = powB[i - 1] * b
    pending1 = []
    pending2 = []
    for t in range(2):
        max_val = (n + 1) // 2 if t == 0 else n // 2
        for i in range(1 << max_val):
            s = 0
            for j in range(max_val):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (t * max_val)] + q * powB[j + (t * max_val)]
                    if s > INF:
                        continue
            if t == 0:
                pending