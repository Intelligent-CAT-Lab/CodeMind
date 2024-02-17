import sys
range = xrange
input = raw_input

mod = 10**9 + 7

n,h,d = [int(x) for x in input().split()]

big = 10**6+10
fac = [1]
while len(fac)<big:
    fac.append(fac[-1] * len(fac) % mod)

cumfac = [0]
for f in fac:
    cumfac.append((cumfac[-1] + f)%mod)

DP = [0]*(h+1)
DP[0] = fac[n]

multi = cumfac[n+1] - cumfac[1]
s = 0
for i in range(1,h):
    s += DP[i-1]
    if i-d-1>=0:
        s -= DP[i-d-1]
    s %= mod
    DP[i] = s*multi % mod

# special
DP[h] = sum(DP[max(0,h-d):h]) % mod

print DP[-1]
