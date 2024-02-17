import sys
readline = sys.stdin.readline
from collections import defaultdict

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

N, X, D = list(map(int, readline().split()))

ans = 0
if X == D == 0:
    ans = 1
elif X == 0:
    ans = N**2-N*(N+1)//2+1
elif D == 0:
    ans = (N+1)
else:
    if D < 0:
        X = -X
        D = -D
    g = gcd(abs(X), abs(D))
    X //= g
    D //= g
    
    LR = defaultdict(list)
    LR[0].append((0, 0))
    for i in range(1, N+1):
        Li, Ri = (i-1)*i//2, i*N - i*(i+1)//2
        LR[(i*X)%D].append((Li+i*X//D, Ri+i*X//D))
    
    for V in list(LR.values()):
        V.sort()
        lp, rp = V[0]
        for l, r in V[1:]:
            if rp < l:
                ans = (ans + rp-lp+1)
                lp, rp = l, r
            else:
                rp = max(r, rp)
        ans = (ans + rp-lp+1)
print(ans)