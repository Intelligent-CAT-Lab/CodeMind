import sys
mod = 998244353
sys.setrecursionlimit(pow(10, 8))
def power(x, y):
    if   y == 0: return 1
    elif y == 1	 : return x % mod
    elif y % 2 == 0 : return power(x, y//2)**2 % mod
    else: return power(x, (y-1)//2)**2 * x % mod
def mul(a, b):
    return ((a % mod) * (b % mod)) % mod
def div(a, b):
    return mul(a, power(b, mod-2))
def div2(a, b):
    return mul(a, modinv(b))
def modinv(a):
    b, u, v = mod, 1, 0
    while b:
        t = a//b
        a, u = a-t*b, u-t*v
        a, b, u, v = b, a, v, u
    u %= mod
    return u
def cmb(n, r):
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return g1[n] * g2[r] * g2[n-r]
NNN = (10**6)
g1 = [1, 1]
g2 = [1, 1]
inverse = [0, 1]
for i in range( 2, NNN + 1 ):
    g1.append( ( g1[-1] * i ) % mod )
    inverse.append( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2.append( (g2[-1] * inverse[-1]) % mod )
N, M, K = map(int, "3 2 1".split())
r = 0
for i in range(K+1):
    r += (cmb(N-1, i) * M * pow(M-1, N-i-1, mod)) % mod
    r %= mod
print(r)
