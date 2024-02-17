
def factorials_with_inv(k,mod):
    """
    0! ... k! とそれらのmod逆元を求めて返す
    """
    fac = [1]*(k+1)
    inv = [1]*(k+1)
    t = 1
    for i in range(1,k+1):
        t *= i
        t %= mod
        fac[i] = t

    t = pow(t,-1,mod)
    for i in reversed(list(range(1,k+1))):
        inv[i] = t
        t *= i
        t %= mod

    return fac, inv

MOD = 10**9+7

def solve(N,M):
    fac,inv = factorials_with_inv(max(N,M), MOD)

    # (M-k)!/(k!(N-k)!) * N!M!/((M-N)!^2)

    res = 0
    sign = True
    for k in range(N+1):
        t = fac[M-k]*inv[k]*inv[N-k]
        if sign:
            res += t
        else:
            res -= t
        res %= MOD
        sign = not sign

    res *= fac[N]*fac[M]*inv[M-N]**2
    res %= MOD
    return res

from itertools import permutations

def naive(N,M):
    res = 0
    for A in permutations(list(range(M)),N):
        for B in permutations(list(range(M)),N):
            res += all(a != b for a,b in zip(A,B))
    return res%MOD

if __name__ == '__main__':
    N,M = list(map(int,input().split()))

    # print(naive(N,M))
    print((solve(N,M)))