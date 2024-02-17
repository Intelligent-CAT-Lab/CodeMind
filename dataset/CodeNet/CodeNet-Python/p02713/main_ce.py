from math import gcd
K = int("2")
ans = 0
for a in range(1, K+1):
    for b in range(1, K+1):
        for c in range(1, K+1):
            ans += gcd(gcd(a, b), c)
print(ans)